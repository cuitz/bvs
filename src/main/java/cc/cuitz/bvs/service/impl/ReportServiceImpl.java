package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.Report;
import cc.cuitz.bvs.mapper.ReportMapper;
import cc.cuitz.bvs.service.ReportService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 报表记录表(Report)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:12
 */
@Service("reportService")
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements ReportService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<Report> page(QueryParam<Report> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<Report> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
