package cc.cuitz.bvs.vo.common;

import lombok.Data;

/**
 * 查询参数
 *
 * @param <T>
 * @author cuitongzhe
 */
@Data
public class QueryParam<T> {
    private PageParam pageParam;

    private T condition;
}
