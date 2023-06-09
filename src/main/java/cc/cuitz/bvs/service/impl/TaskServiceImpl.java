package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.entity.Task;
import cc.cuitz.bvs.mapper.TaskMapper;
import cc.cuitz.bvs.service.TaskService;
import cc.cuitz.bvs.util.SessionUtil;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 任务记录表(Task)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Service("taskService")
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<Task> page(QueryParam<Task> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<Task> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }

    @Override
    public Task insert(Task task) {
        SysUser currentUser = SessionUtil.currentUser();
        task.setCreator(currentUser.getUsername());
        task.setCreateTime(DateUtil.date());
        save(task);
        return task;
    }
}
