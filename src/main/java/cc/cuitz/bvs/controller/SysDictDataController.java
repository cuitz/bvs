package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.service.SysDictDataService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典数据表(SysDictData)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
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
     * @param id
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
    public List<SysDictData> findAll(SysDictData sysDictData) {
        return this.sysDictDataService.list(new QueryWrapper<>(sysDictData));
    }

}
