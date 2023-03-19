package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务记录表(Task)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {

}
