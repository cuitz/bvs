package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.Task;
import cc.cuitz.bvs.mapper.TaskMapper;
import cc.cuitz.bvs.service.TaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 任务记录表(Task)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@Service("taskService")
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService {

}
