package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysRoleMenu;
import cc.cuitz.bvs.service.SysRoleMenuService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色关联菜单表(SysRoleMenu)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:12
 */
@RestController
@RequestMapping("/api/sysRoleMenu")
public class SysRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public SysRoleMenu findDetail(@PathVariable String id) {
        return this.sysRoleMenuService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param sysRoleMenu 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<SysRoleMenu> findAll(@RequestBody SysRoleMenu sysRoleMenu) {
        return this.sysRoleMenuService.list(new QueryWrapper<>(sysRoleMenu));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<SysRoleMenu> findPage(@RequestBody QueryParam<SysRoleMenu> queryParam) {
        return this.sysRoleMenuService.page(queryParam);
    }

}
