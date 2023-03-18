package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.CheckItem;
import cc.cuitz.bvs.service.CheckItemService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 检查项表(CheckItem)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@RestController
@RequestMapping("/api/checkItem")
public class CheckItemController {
    /**
     * 服务对象
     */
    @Resource
    private CheckItemService checkItemService;

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public CheckItem findDetail(@PathVariable String id) {
        return this.checkItemService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param checkItem 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<CheckItem> findAll(CheckItem checkItem) {
        return this.checkItemService.list(new QueryWrapper<>(checkItem));
    }

}
