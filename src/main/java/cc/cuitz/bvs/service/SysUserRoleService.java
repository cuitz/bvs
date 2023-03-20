package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.SysUserRole;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 用户关联角色表(SysUserRole)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
 */
public interface SysUserRoleService extends IService<SysUserRole> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<SysUserRole> page(QueryParam<SysUserRole> queryParam);
}
