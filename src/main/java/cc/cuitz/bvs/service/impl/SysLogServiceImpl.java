package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysLog;
import cc.cuitz.bvs.mapper.SysLogMapper;
import cc.cuitz.bvs.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志记录表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
