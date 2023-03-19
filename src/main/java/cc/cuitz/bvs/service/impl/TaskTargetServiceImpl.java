package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskTarget;
import cc.cuitz.bvs.mapper.TaskTargetMapper;
import cc.cuitz.bvs.service.TaskTargetService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 任务核查目标数据表(TaskTarget)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:35
 */
@Service("taskTargetService")
public class TaskTargetServiceImpl extends ServiceImpl<TaskTargetMapper, TaskTarget> implements TaskTargetService {

}
