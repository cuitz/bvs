package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskTarget;
import cc.cuitz.bvs.mapper.TaskTargetMapper;
import cc.cuitz.bvs.service.TaskTargetService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 任务核查目标数据表(TaskTarget)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:13
 */
@Service("taskTargetService")
public class TaskTargetServiceImpl extends ServiceImpl<TaskTargetMapper, TaskTarget> implements TaskTargetService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<TaskTarget> page(QueryParam<TaskTarget> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<TaskTarget> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
