package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysRoleMenu;
import cc.cuitz.bvs.service.SysRoleMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色关联菜单表(SysRoleMenu)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
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
     * @param id
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
    public List<SysRoleMenu> findAll(SysRoleMenu sysRoleMenu) {
        return this.sysRoleMenuService.list(new QueryWrapper<>(sysRoleMenu));
    }

}
