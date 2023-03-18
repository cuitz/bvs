package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysRole;
import cc.cuitz.bvs.mapper.SysRoleMapper;
import cc.cuitz.bvs.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * (SysRole)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:12
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

}
