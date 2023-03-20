package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.TaskResultItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务核查项结果表(TaskResultItem)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Mapper
public interface TaskResultItemMapper extends BaseMapper<TaskResultItem> {

}
