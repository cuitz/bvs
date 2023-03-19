package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单权限表(SysMenu)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

}
