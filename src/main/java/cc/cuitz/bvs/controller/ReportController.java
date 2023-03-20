package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.Report;
import cc.cuitz.bvs.service.ReportService;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 报表记录表(Report)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:29
 */
@RestController
@RequestMapping("/api/report")
public class ReportController {
    /**
     * 服务对象
     */
    @Resource
    private ReportService reportService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public Report findDetail(@PathVariable String id) {
        return this.reportService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param report 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<Report> findAll(@RequestBody Report report) {
        return this.reportService.list(new QueryWrapper<>(report));
    }

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return
     */
    @PostMapping("/find/page")
    public PageInfo<Report> findPage(@RequestBody @Validated QueryParam<Report> queryParam) {
        return this.reportService.page(queryParam);
    }

}
