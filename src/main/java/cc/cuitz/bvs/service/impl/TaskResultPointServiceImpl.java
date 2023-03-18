package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskResultPoint;
import cc.cuitz.bvs.mapper.TaskResultPointMapper;
import cc.cuitz.bvs.service.ITaskResultPointService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务检查点结果表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class TaskResultPointServiceImpl extends ServiceImpl<TaskResultPointMapper, TaskResultPoint> implements ITaskResultPointService {

}
