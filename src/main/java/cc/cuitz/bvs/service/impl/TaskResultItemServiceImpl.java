package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskResultItem;
import cc.cuitz.bvs.mapper.TaskResultItemMapper;
import cc.cuitz.bvs.service.TaskResultItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 任务核查项结果表(TaskResultItem)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@Service("taskResultItemService")
public class TaskResultItemServiceImpl extends ServiceImpl<TaskResultItemMapper, TaskResultItem> implements TaskResultItemService {

}
