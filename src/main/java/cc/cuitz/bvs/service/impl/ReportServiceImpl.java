package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.Report;
import cc.cuitz.bvs.mapper.ReportMapper;
import cc.cuitz.bvs.service.ReportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 报表记录表(Report)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@Service("reportService")
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements ReportService {

}
