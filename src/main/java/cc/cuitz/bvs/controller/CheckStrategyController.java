package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.CheckStrategy;
import cc.cuitz.bvs.service.CheckStrategyService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 核查策略表(CheckStrategy)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@RestController
@RequestMapping("/api/checkStrategy")
public class CheckStrategyController {
    /**
     * 服务对象
     */
    @Resource
    private CheckStrategyService checkStrategyService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public CheckStrategy findDetail(@PathVariable String id) {
        return this.checkStrategyService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param checkStrategy 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<CheckStrategy> findAll(CheckStrategy checkStrategy) {
        return this.checkStrategyService.list(new QueryWrapper<>(checkStrategy));
    }

}
