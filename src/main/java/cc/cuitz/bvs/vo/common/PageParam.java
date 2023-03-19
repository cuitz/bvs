package cc.cuitz.bvs.vo.common;

import lombok.Data;

/**
 * 前端传来的分页参数
 *
 * @author cuitongzhe
 */
@Data
public class PageParam {
    private Integer pageNum;

    private Integer pageSize;

    private String orderBy;
}
