package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.SysUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户关联角色表(SysUserRole)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

}
