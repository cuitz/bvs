package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.CheckItem;
import cc.cuitz.bvs.service.CheckItemService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 检查项表(CheckItem)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:08
 */
@Tag(name = "检查项表(CheckItem)控制层")
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
     * @param id 主键
     * @return
     */
    @Operation(summary = "根据ID查询")
    @Parameter(name = "id", required = true)
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
    @Operation(summary = "查询所有数据")
    @Parameter(name = "checkItem", description = "查询条件", required = true)
    @PostMapping("/find/all")
    public List<CheckItem> findAll(@RequestBody CheckItem checkItem) {
        return this.checkItemService.list(new QueryWrapper<>(checkItem));
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
    public PageInfo<CheckItem> findPage(@RequestBody QueryParam<CheckItem> queryParam) {
        return this.checkItemService.page(queryParam);
    }

}
