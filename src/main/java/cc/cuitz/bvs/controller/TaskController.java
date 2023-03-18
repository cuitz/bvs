package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.Task;
import cc.cuitz.bvs.service.TaskService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务记录表(Task)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@RestController
@RequestMapping("/api/task")
public class TaskController {
    /**
     * 服务对象
     */
    @Resource
    private TaskService taskService;

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public Task findDetail(@PathVariable String id) {
        return this.taskService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param task 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<Task> findAll(Task task) {
        return this.taskService.list(new QueryWrapper<>(task));
    }

}
