package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.CheckPoint;
import cc.cuitz.bvs.service.CheckPointService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 检查点表(CheckPoint)控制层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:33
 */
@RestController
@RequestMapping("/api/checkPoint")
public class CheckPointController {
    /**
     * 服务对象
     */
    @Resource
    private CheckPointService checkPointService;

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/find/detail/{id}")
    public CheckPoint findDetail(@PathVariable String id) {
        return this.checkPointService.getById(id);
    }

    /**
     * 查询所有数据
     *
     * @param checkPoint 查询实体
     * @return
     */
    @PostMapping("/find/all")
    public List<CheckPoint> findAll(CheckPoint checkPoint) {
        return this.checkPointService.list(new QueryWrapper<>(checkPoint));
    }

}
