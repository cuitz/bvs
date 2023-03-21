package cc.cuitz.bvs.vo.common;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import org.springframework.util.StringUtils;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 前端传来的分页参数
 *
 * @author cuitongzhe
 */
@Data
@Valid
public class PageParam {
    @NotNull
    @Min(1)
    private Integer pageNum;

    @NotNull
    @Min(1)
    private Integer pageSize;

    private List<String> sort;

    public String getOrderBy() {
        if (sort == null || sort.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : sort) {
            if (StringUtils.hasText(s)) {
                List<String> strings = StrUtil.split(s, " ");
                if (strings.size() > 2) {
                    return "";
                }
                if (strings.size() == 2) {
                    sb.append(StrUtil.toUnderlineCase(strings.get(0))).append(" ").append(strings.get(1));
                } else {
                    sb.append(StrUtil.toUnderlineCase(strings.get(0)));
                }
                sb.append(",");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}
