package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.Report;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 报表记录表(Report)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:08
 */
public interface ReportService extends IService<Report> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<Report> page(QueryParam<Report> queryParam);
}
