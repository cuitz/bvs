package cc.cuitz.bvs.advice;

import cc.cuitz.bvs.vo.common.ApiResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {
    private final ObjectMapper objectMapper;

    public ResponseAdvice(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        // 这里需要放开springdoc，否则影响swagger页面
        return !returnType.getDeclaringClass().getName().contains("org.springdoc");
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {
        if (body == null) {
            return null;
        }
        if (body instanceof String) {
            return objectMapper.writeValueAsString(ApiResult.success(body));
        }
        if (body instanceof ApiResult) {
            return body;
        }
        return ApiResult.success(body);
    }
}
