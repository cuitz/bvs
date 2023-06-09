package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.CheckStrategy;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 核查策略表(CheckStrategy)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:08
 */
public interface CheckStrategyService extends IService<CheckStrategy> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<CheckStrategy> page(QueryParam<CheckStrategy> queryParam);
}
