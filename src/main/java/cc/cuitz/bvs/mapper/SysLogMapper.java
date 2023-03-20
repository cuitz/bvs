package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.SysLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志记录表(SysLog)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
 */
@Mapper
public interface SysLogMapper extends BaseMapper<SysLog> {

}
