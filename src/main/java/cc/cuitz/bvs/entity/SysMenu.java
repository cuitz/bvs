package cc.cuitz.bvs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 菜单权限表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("sys_menu")
public class SysMenu extends Model<SysMenu> {

    /**
     * 菜单ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单名称
     */
    @TableField("menu_name")
    private String menuName;

    /**
     * 父菜单ID
     */
    @TableField("pid")
    private Integer pid;

    /**
     * 显示顺序
     */
    @TableField("order_num")
    private Integer orderNum;

    /**
     * 路由地址
     */
    @TableField("path")
    private String path;

    /**
     * 组件路径
     */
    @TableField("component")
    private String component;

    /**
     * 菜单状态（0正常 1停用）
     */
    @TableField("status")
    private String status;

    /**
     * 权限标识
     */
    @TableField("perms")
    private String perms;

    @TableField("meta")
    private String meta;

    public static final String ID = "id";

    public static final String MENU_NAME = "menu_name";

    public static final String PID = "pid";

    public static final String ORDER_NUM = "order_num";

    public static final String PATH = "path";

    public static final String COMPONENT = "component";

    public static final String STATUS = "status";

    public static final String PERMS = "perms";

    public static final String META = "meta";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
