package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.TaskTarget;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务核查目标数据表(TaskTarget)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:35
 */
@Mapper
public interface TaskTargetMapper extends BaseMapper<TaskTarget> {

}
