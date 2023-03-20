package cc.cuitz.bvs.vo.common;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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

    private String orderBy;
}
