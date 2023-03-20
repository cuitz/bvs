package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysDictType;
import cc.cuitz.bvs.service.SysDictTypeService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典类型表(SysDictType)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
 */
@RestController
@RequestMapping("/api/sysDictType")
public class SysDictTypeController {
    /**
     * 服务对象
     */
    @Resource
    private SysDictTypeService sysDictTypeService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public SysDictType findDetail(@PathVariable String id) {
        return this.sysDictTypeService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param sysDictType 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<SysDictType> findAll(@RequestBody SysDictType sysDictType) {
        return this.sysDictTypeService.list(new QueryWrapper<>(sysDictType));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<SysDictType> findPage(@RequestBody @Validated QueryParam<SysDictType> queryParam) {
        return this.sysDictTypeService.page(queryParam);
    }

}
