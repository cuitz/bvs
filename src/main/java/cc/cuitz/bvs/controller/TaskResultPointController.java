package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.TaskResultPoint;
import cc.cuitz.bvs.service.TaskResultPointService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务检查点结果表(TaskResultPoint)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:13
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
    public List<TaskResultPoint> findAll(@RequestBody TaskResultPoint taskResultPoint) {
        return this.taskResultPointService.list(new QueryWrapper<>(taskResultPoint));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<TaskResultPoint> findPage(@RequestBody QueryParam<TaskResultPoint> queryParam) {
        return this.taskResultPointService.page(queryParam);
    }

}
