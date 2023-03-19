package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.Task;
import cc.cuitz.bvs.service.TaskService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务记录表(Task)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:13
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
     * @param id 主键
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
    public List<Task> findAll(@RequestBody Task task) {
        return this.taskService.list(new QueryWrapper<>(task));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<Task> findPage(@RequestBody QueryParam<Task> queryParam) {
        return this.taskService.page(queryParam);
    }

}
