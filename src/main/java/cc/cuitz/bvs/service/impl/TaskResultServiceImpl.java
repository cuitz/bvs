package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskResult;
import cc.cuitz.bvs.mapper.TaskResultMapper;
import cc.cuitz.bvs.service.ITaskResultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务结果表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class TaskResultServiceImpl extends ServiceImpl<TaskResultMapper, TaskResult> implements ITaskResultService {

}
