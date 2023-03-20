package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckStrategy;
import cc.cuitz.bvs.mapper.CheckStrategyMapper;
import cc.cuitz.bvs.service.CheckStrategyService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 核查策略表(CheckStrategy)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:08
 */
@Service("checkStrategyService")
public class CheckStrategyServiceImpl extends ServiceImpl<CheckStrategyMapper, CheckStrategy> implements CheckStrategyService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<CheckStrategy> page(QueryParam<CheckStrategy> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<CheckStrategy> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
