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
 * 
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    @TableField("role_name")
    private String roleName;

    /**
     * 角色权限字符串
     */
    @TableField("role_key")
    private String roleKey;

    /**
     * 角色状态（0正常 1停用）
     */
    @TableField("status")
    private String status;

    public static final String ID = "id";

    public static final String ROLE_NAME = "role_name";

    public static final String ROLE_KEY = "role_key";

    public static final String STATUS = "status";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
