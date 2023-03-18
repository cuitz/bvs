package cc.cuitz.bvs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名称
     */
    @TableField("username")
    private String username;

    /**
     * 用户昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户状态（0正常 1禁用 2过期）
     */
    @TableField("status")
    private String status;

    /**
     * 过期时间
     */
    @TableField("expire_time")
    private Date expireTime;

    /**
     * 性别（0男 1女 2未知）
     */
    @TableField("gender")
    private String gender;

    /**
     * 手机号码
     */
    @TableField("phone_number")
    private String phoneNumber;

    /**
     * 邮件地址
     */
    @TableField("email")
    private String email;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    public static final String ID = "id";

    public static final String USERNAME = "username";

    public static final String NICKNAME = "nickname";

    public static final String PASSWORD = "password";

    public static final String STATUS = "status";

    public static final String EXPIRE_TIME = "expire_time";

    public static final String GENDER = "gender";

    public static final String PHONE_NUMBER = "phone_number";

    public static final String EMAIL = "email";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
