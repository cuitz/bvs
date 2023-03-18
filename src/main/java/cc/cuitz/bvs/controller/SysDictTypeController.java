package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysDictType;
import cc.cuitz.bvs.service.SysDictTypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典类型表(SysDictType)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
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
     * @param id
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
    public List<SysDictType> findAll(SysDictType sysDictType) {
        return this.sysDictTypeService.list(new QueryWrapper<>(sysDictType));
    }

}
