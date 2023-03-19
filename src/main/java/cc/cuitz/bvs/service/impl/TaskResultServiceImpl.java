package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskResult;
import cc.cuitz.bvs.mapper.TaskResultMapper;
import cc.cuitz.bvs.service.TaskResultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 任务结果表(TaskResult)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:35
 */
@Service("taskResultService")
public class TaskResultServiceImpl extends ServiceImpl<TaskResultMapper, TaskResult> implements TaskResultService {

}
