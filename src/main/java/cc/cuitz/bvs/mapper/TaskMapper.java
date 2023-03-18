package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 任务记录表 Mapper 接口
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {

}
