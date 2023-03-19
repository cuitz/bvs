package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.TaskResult;
import cc.cuitz.bvs.service.TaskResultService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务结果表(TaskResult)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
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
    public List<TaskResult> findAll(TaskResult taskResult) {
        return this.taskResultService.list(new QueryWrapper<>(taskResult));
    }

}
