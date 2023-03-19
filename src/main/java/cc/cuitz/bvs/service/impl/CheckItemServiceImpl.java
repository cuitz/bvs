package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckItem;
import cc.cuitz.bvs.mapper.CheckItemMapper;
import cc.cuitz.bvs.service.CheckItemService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 检查项表(CheckItem)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:12
 */
@Service("checkItemService")
public class CheckItemServiceImpl extends ServiceImpl<CheckItemMapper, CheckItem> implements CheckItemService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<CheckItem> page(QueryParam<CheckItem> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<CheckItem> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
