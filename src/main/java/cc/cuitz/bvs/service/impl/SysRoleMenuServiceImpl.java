package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysRoleMenu;
import cc.cuitz.bvs.mapper.SysRoleMenuMapper;
import cc.cuitz.bvs.service.SysRoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 角色关联菜单表(SysRoleMenu)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

}
