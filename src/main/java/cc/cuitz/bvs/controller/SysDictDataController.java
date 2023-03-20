package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.service.SysDictDataService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典数据表(SysDictData)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
 */
@RestController
@RequestMapping("/api/sysDictData")
public class SysDictDataController {
    /**
     * 服务对象
     */
    @Resource
    private SysDictDataService sysDictDataService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public SysDictData findDetail(@PathVariable String id) {
        return this.sysDictDataService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param sysDictData 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<SysDictData> findAll(@RequestBody SysDictData sysDictData) {
        return this.sysDictDataService.list(new QueryWrapper<>(sysDictData));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<SysDictData> findPage(@RequestBody @Validated QueryParam<SysDictData> queryParam) {
        return this.sysDictDataService.page(queryParam);
    }

}
