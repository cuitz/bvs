package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysMenu;
import cc.cuitz.bvs.service.SysMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单权限表(SysMenu)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
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
     * @param id
     * @return
     */
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
    @PostMapping("/find/all")
    public List<SysMenu> findAll(SysMenu sysMenu) {
        return this.sysMenuService.list(new QueryWrapper<>(sysMenu));
    }

}
