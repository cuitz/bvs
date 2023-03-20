package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckPoint;
import cc.cuitz.bvs.mapper.CheckPointMapper;
import cc.cuitz.bvs.service.CheckPointService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 检查点表(CheckPoint)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:29
 */
@Service("checkPointService")
public class CheckPointServiceImpl extends ServiceImpl<CheckPointMapper, CheckPoint> implements CheckPointService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<CheckPoint> page(QueryParam<CheckPoint> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<CheckPoint> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
