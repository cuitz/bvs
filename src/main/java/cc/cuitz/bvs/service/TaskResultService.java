package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.TaskResult;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 任务结果表(TaskResult)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:13
 */
public interface TaskResultService extends IService<TaskResult> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<TaskResult> page(QueryParam<TaskResult> queryParam);
}
