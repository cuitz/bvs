package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(SysUser)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@RestController
@RequestMapping("/api/sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public SysUser findDetail(@PathVariable String id) {
        return this.sysUserService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param sysUser 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<SysUser> findAll(SysUser sysUser) {
        return this.sysUserService.list(new QueryWrapper<>(sysUser));
    }

}
