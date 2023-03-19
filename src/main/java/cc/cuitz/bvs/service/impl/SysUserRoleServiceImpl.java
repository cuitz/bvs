package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysUserRole;
import cc.cuitz.bvs.mapper.SysUserRoleMapper;
import cc.cuitz.bvs.service.SysUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户关联角色表(SysUserRole)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

}
