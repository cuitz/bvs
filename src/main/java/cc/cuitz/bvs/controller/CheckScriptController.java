package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.CheckScript;
import cc.cuitz.bvs.service.CheckScriptService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 检查脚本表(CheckScript)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:12
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
     * @param id 主键
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
    public List<CheckScript> findAll(@RequestBody CheckScript checkScript) {
        return this.checkScriptService.list(new QueryWrapper<>(checkScript));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<CheckScript> findPage(@RequestBody QueryParam<CheckScript> queryParam) {
        return this.checkScriptService.page(queryParam);
    }

}
