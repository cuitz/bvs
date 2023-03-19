package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysRole;
import cc.cuitz.bvs.mapper.SysRoleMapper;
import cc.cuitz.bvs.service.SysRoleService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (SysRole)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:12
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<SysRole> page(QueryParam<SysRole> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<SysRole> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }
}
