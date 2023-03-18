package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.TaskResultItem;
import cc.cuitz.bvs.service.TaskResultItemService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务核查项结果表(TaskResultItem)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@RestController
@RequestMapping("/api/taskResultItem")
public class TaskResultItemController {
    /**
     * 服务对象
     */
    @Resource
    private TaskResultItemService taskResultItemService;

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public TaskResultItem findDetail(@PathVariable String id) {
        return this.taskResultItemService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param taskResultItem 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<TaskResultItem> findAll(TaskResultItem taskResultItem) {
        return this.taskResultItemService.list(new QueryWrapper<>(taskResultItem));
    }

}
