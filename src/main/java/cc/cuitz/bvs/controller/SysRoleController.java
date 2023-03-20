package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysRole;
import cc.cuitz.bvs.service.SysRoleService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysRole)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
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
    public List<SysRole> findAll(@RequestBody SysRole sysRole) {
        return this.sysRoleService.list(new QueryWrapper<>(sysRole));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<SysRole> findPage(@RequestBody @Validated QueryParam<SysRole> queryParam) {
        return this.sysRoleService.page(queryParam);
    }

}
