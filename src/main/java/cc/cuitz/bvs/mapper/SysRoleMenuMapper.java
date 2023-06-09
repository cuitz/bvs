package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.SysRoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色关联菜单表(SysRoleMenu)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

}
