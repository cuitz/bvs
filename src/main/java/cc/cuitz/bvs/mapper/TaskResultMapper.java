package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.TaskResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务结果表(TaskResult)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@Mapper
public interface TaskResultMapper extends BaseMapper<TaskResult> {

}
