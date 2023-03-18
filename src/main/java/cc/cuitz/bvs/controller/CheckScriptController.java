package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.CheckScript;
import cc.cuitz.bvs.service.CheckScriptService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 检查脚本表(CheckScript)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@RestController
@RequestMapping("/api/checkScript")
public class CheckScriptController {
    /**
     * 服务对象
     */
    @Resource
    private CheckScriptService checkScriptService;

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public CheckScript findDetail(@PathVariable String id) {
        return this.checkScriptService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param checkScript 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<CheckScript> findAll(CheckScript checkScript) {
        return this.checkScriptService.list(new QueryWrapper<>(checkScript));
    }

}
