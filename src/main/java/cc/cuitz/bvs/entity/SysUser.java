package cc.cuitz.bvs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * 用户表(SysUser)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-20 17:39:38
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
    @TableField(value = "username")
    @NotBlank(message = "用户名不能为空")
    @Length(min = 6, max = 20, message = "用户名长度在6-20位之间")
    private String username;

    /**
     * 用户昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 密码
     */
    @TableField(value = "password")
    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 盐
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 用户状态（0正常 1禁用 2过期）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 过期时间
     */
    @TableField(value = "expire_time")
    private Date expireTime;

    /**
     * 性别（0男 1女 2未知）
     */
    @TableField(value = "gender")
    private String gender;

    /**
     * 手机号码
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    /**
     * 邮件地址
     */
    @TableField(value = "email")
    private String email;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

}
