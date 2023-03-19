package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.TaskResultItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务核查项结果表(TaskResultItem)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:13
 */
@Mapper
public interface TaskResultItemMapper extends BaseMapper<TaskResultItem> {

}
