package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.SysRoleMenu;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 角色关联菜单表(SysRoleMenu)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<SysRoleMenu> page(QueryParam<SysRoleMenu> queryParam);
}
