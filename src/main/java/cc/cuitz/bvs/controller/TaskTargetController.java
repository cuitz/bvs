package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.TaskTarget;
import cc.cuitz.bvs.service.TaskTargetService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务核查目标数据表(TaskTarget)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:35
 */
@RestController
@RequestMapping("/api/taskTarget")
public class TaskTargetController {
    /**
     * 服务对象
     */
    @Resource
    private TaskTargetService taskTargetService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public TaskTarget findDetail(@PathVariable String id) {
        return this.taskTargetService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param taskTarget 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<TaskTarget> findAll(TaskTarget taskTarget) {
        return this.taskTargetService.list(new QueryWrapper<>(taskTarget));
    }

}
