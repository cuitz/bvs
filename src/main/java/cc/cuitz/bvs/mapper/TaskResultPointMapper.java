package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.TaskResultPoint;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务检查点结果表(TaskResultPoint)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@Mapper
public interface TaskResultPointMapper extends BaseMapper<TaskResultPoint> {

}
