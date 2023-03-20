package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.TaskTarget;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 任务核查目标数据表(TaskTarget)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:31
 */
public interface TaskTargetService extends IService<TaskTarget> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<TaskTarget> page(QueryParam<TaskTarget> queryParam);
}
