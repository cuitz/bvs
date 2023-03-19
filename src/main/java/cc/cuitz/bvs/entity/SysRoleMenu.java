package cc.cuitz.bvs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 角色关联菜单表(SysRoleMenu)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Getter
@Setter
@TableName("sys_role_menu")
public class SysRoleMenu extends Model<SysRoleMenu> {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Integer roleId;

    /**
     * 菜单id
     */
    @TableField(value = "menu_id")
    private Integer menuId;

}
