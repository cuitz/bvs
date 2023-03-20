package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.Task;
import cc.cuitz.bvs.service.TaskService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务记录表(Task)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Tag(name = "任务记录表(Task)控制层")
@RestController
@RequestMapping("/api/task")
public class TaskController {
    /**
     * 服务对象
     */
    @Resource
    private TaskService taskService;

    /**
     * 新增数据
     *
     * @param task
     * @return
     */
    @Operation(summary = "新增数据")
    @Parameter(name = "task", required = true)
    @PostMapping("/add")
    public Task add(@RequestBody Task task) {
        return this.taskService.insert(task);
    }

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @Operation(summary = "根据ID查询")
    @Parameter(name = "id", required = true)
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
    @Operation(summary = "查询所有数据")
    @Parameter(name = "task", description = "查询条件", required = true)
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
    @Operation(summary = "分页查询数据")
    @Parameters({
            @Parameter(name = "pageParam", description = "分页参数", required = true),
            @Parameter(name = "condition", description = "查询条件")
    })
    @PostMapping("/find/page")
    public PageInfo<Task> findPage(@RequestBody @Validated QueryParam<Task> queryParam) {
        return this.taskService.page(queryParam);
    }

    /**
     * 修改数据
     *
     * @param task
     * @return
     */
    @Operation(summary = "修改数据")
    @Parameter(name = "task", required = true)
    @PostMapping("/edit")
    public boolean edit(@RequestBody Task task) {
        return this.taskService.updateById(task);
    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    @Operation(summary = "删除数据")
    @Parameter(name = "id", required = true)
    @PostMapping("/delete")
    public boolean delete(@RequestBody List<Integer> id) {
        return this.taskService.removeBatchByIds(id);
    }

}
