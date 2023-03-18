package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskResultPoint;
import cc.cuitz.bvs.mapper.TaskResultPointMapper;
import cc.cuitz.bvs.service.TaskResultPointService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 任务检查点结果表(TaskResultPoint)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@Service("taskResultPointService")
public class TaskResultPointServiceImpl extends ServiceImpl<TaskResultPointMapper, TaskResultPoint> implements TaskResultPointService {

}
