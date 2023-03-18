package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysMenu;
import cc.cuitz.bvs.mapper.SysMenuMapper;
import cc.cuitz.bvs.service.SysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 菜单权限表(SysMenu)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

}
