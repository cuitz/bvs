package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.TaskResultItem;
import cc.cuitz.bvs.mapper.TaskResultItemMapper;
import cc.cuitz.bvs.service.TaskResultItemService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 任务核查项结果表(TaskResultItem)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:13
 */
@Service("taskResultItemService")
public class TaskResultItemServiceImpl extends ServiceImpl<TaskResultItemMapper, TaskResultItem> implements TaskResultItemService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<TaskResultItem> page(QueryParam<TaskResultItem> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<TaskResultItem> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
