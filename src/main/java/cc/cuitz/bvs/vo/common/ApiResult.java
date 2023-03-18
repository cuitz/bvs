package cc.cuitz.bvs.vo.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 接口返回数据结构
 *
 * @author cuitongzhe
 */
@Data
public class ApiResult<T> {
    private Integer code;

    private String msg;

    private T data;

    private Long timestamp;

    public ApiResult() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ApiResult<T> success(T data) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(HttpStatus.OK.value());
        apiResult.setMsg("success");
        apiResult.setData(data);
        return apiResult;
    }

    public static <T> ApiResult<T> fail(int code, String message) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(code);
        apiResult.setMsg(message);
        return apiResult;
    }

}
