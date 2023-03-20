package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskResultPoint;
import cc.cuitz.bvs.mapper.TaskResultPointMapper;
import cc.cuitz.bvs.service.TaskResultPointService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 任务检查点结果表(TaskResultPoint)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:31
 */
@Service("taskResultPointService")
public class TaskResultPointServiceImpl extends ServiceImpl<TaskResultPointMapper, TaskResultPoint> implements TaskResultPointService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<TaskResultPoint> page(QueryParam<TaskResultPoint> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<TaskResultPoint> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
