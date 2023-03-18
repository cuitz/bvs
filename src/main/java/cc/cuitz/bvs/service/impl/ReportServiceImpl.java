package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.Report;
import cc.cuitz.bvs.mapper.ReportMapper;
import cc.cuitz.bvs.service.IReportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 报表记录表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements IReportService {

}
