package cc.cuitz.bvs.vo.common;

import lombok.Data;

import javax.validation.Valid;

/**
 * 查询参数
 *
 * @param <T>
 * @author cuitongzhe
 */
@Data
public class QueryParam<T> {
    @Valid
    private PageParam pageParam;

    private T condition;
}
