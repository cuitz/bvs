package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.TaskResultPoint;
import cc.cuitz.bvs.service.TaskResultPointService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务检查点结果表(TaskResultPoint)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:35
 */
@RestController
@RequestMapping("/api/taskResultPoint")
public class TaskResultPointController {
    /**
     * 服务对象
     */
    @Resource
    private TaskResultPointService taskResultPointService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public TaskResultPoint findDetail(@PathVariable String id) {
        return this.taskResultPointService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param taskResultPoint 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<TaskResultPoint> findAll(TaskResultPoint taskResultPoint) {
        return this.taskResultPointService.list(new QueryWrapper<>(taskResultPoint));
    }

}
