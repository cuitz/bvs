package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.Report;
import cc.cuitz.bvs.service.ReportService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 报表记录表(Report)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
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
     * @param id
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
    public List<Report> findAll(Report report) {
        return this.reportService.list(new QueryWrapper<>(report));
    }

}
