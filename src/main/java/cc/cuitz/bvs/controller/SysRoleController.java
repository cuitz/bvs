package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysRole;
import cc.cuitz.bvs.service.SysRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysRole)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@RestController
@RequestMapping("/api/sysRole")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public SysRole findDetail(@PathVariable String id) {
        return this.sysRoleService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param sysRole 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<SysRole> findAll(SysRole sysRole) {
        return this.sysRoleService.list(new QueryWrapper<>(sysRole));
    }

}
