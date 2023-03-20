package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysMenu;
import cc.cuitz.bvs.service.SysMenuService;
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
 * 菜单权限表(SysMenu)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Tag(name = "菜单权限表(SysMenu)控制层")
@RestController
@RequestMapping("/api/sysMenu")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysMenuService sysMenuService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @Operation(summary = "根据ID查询")
    @Parameter(name = "id", required = true)
    @PostMapping("/find/detail/{id}")
    public SysMenu findDetail(@PathVariable String id) {
        return this.sysMenuService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param sysMenu 查询实体
     * @return
     */
    @Operation(summary = "查询所有数据")
    @Parameter(name = "sysMenu", description = "查询条件", required = true)
    @PostMapping("/find/all")
    public List<SysMenu> findAll(@RequestBody SysMenu sysMenu) {
        return this.sysMenuService.list(new QueryWrapper<>(sysMenu));
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
    public PageInfo<SysMenu> findPage(@RequestBody QueryParam<SysMenu> queryParam) {
        return this.sysMenuService.page(queryParam);
    }

}
