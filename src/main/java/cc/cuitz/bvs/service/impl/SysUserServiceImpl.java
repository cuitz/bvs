package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.mapper.SysUserMapper;
import cc.cuitz.bvs.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户表(SysUser)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
