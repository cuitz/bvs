package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.TaskResultItem;
import cc.cuitz.bvs.service.TaskResultItemService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务核查项结果表(TaskResultItem)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
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
     * @param id 主键
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
    public List<TaskResultItem> findAll(@RequestBody TaskResultItem taskResultItem) {
        return this.taskResultItemService.list(new QueryWrapper<>(taskResultItem));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<TaskResultItem> findPage(@RequestBody @Validated QueryParam<TaskResultItem> queryParam) {
        return this.taskResultItemService.page(queryParam);
    }

}
