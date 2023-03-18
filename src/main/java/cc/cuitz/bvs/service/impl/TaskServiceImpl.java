package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.Task;
import cc.cuitz.bvs.mapper.TaskMapper;
import cc.cuitz.bvs.service.ITaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务记录表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {

}
