package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysLog;
import cc.cuitz.bvs.service.SysLogService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统日志记录表(SysLog)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@RestController
@RequestMapping("/api/sysLog")
public class SysLogController {
    /**
     * 服务对象
     */
    @Resource
    private SysLogService sysLogService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public SysLog findDetail(@PathVariable String id) {
        return this.sysLogService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param sysLog 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<SysLog> findAll(SysLog sysLog) {
        return this.sysLogService.list(new QueryWrapper<>(sysLog));
    }

}
