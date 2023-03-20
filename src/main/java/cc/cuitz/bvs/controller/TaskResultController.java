package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.TaskResult;
import cc.cuitz.bvs.service.TaskResultService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务结果表(TaskResult)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
 */
@RestController
@RequestMapping("/api/taskResult")
public class TaskResultController {
    /**
     * 服务对象
     */
    @Resource
    private TaskResultService taskResultService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public TaskResult findDetail(@PathVariable String id) {
        return this.taskResultService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param taskResult 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<TaskResult> findAll(@RequestBody TaskResult taskResult) {
        return this.taskResultService.list(new QueryWrapper<>(taskResult));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<TaskResult> findPage(@RequestBody @Validated QueryParam<TaskResult> queryParam) {
        return this.taskResultService.page(queryParam);
    }

}
