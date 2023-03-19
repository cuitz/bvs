package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysLog;
import cc.cuitz.bvs.mapper.SysLogMapper;
import cc.cuitz.bvs.service.SysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 系统日志记录表(SysLog)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("sysLogService")
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

}
