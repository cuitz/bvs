package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.service.SysUserService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(SysUser)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Tag(name = "用户表(SysUser)控制层")
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
    @Operation(summary = "根据ID查询")
    @Parameter(name = "id", required = true)
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
    @Operation(summary = "查询所有数据")
    @Parameter(name = "sysUser", description = "查询条件", required = true)
    @PostMapping("/find/all")
    public List<SysUser> findAll(@RequestBody SysUser sysUser) {
        return this.sysUserService.list(new QueryWrapper<>(sysUser));
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
    public PageInfo<SysUser> findPage(@RequestBody QueryParam<SysUser> queryParam) {
        return this.sysUserService.page(queryParam);
    }

    @PostMapping("/add")
    public String add(@RequestBody @Validated SysUser user) {
        this.sysUserService.createUser(user);
        return "";
    }
}
