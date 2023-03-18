package cc.cuitz.bvs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

/**
 * 系统日志记录表(SysLog)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@Getter
@Setter
@TableName("sys_log")
public class SysLog extends Model<SysLog> {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 模块标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 业务类型（0其它 1新增 2修改 3删除 4下载）
     */
    @TableField(value = "business_type")
    private String businessType;

    /**
     * 用户账号
     */
    @TableField(value = "username")
    private String username;

    /**
     * 请求方式（get/post/delete/...）
     */
    @TableField(value = "request_method")
    private String requestMethod;

    /**
     * 请求URL
     */
    @TableField(value = "request_url")
    private String requestUrl;

    /**
     * 请求参数
     */
    @TableField(value = "request_param")
    private String requestParam;

    /**
     * 响应参数
     */
    @TableField(value = "response_param")
    private String responseParam;

    /**
     * 操作状态（0正常 1异常）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 错误信息
     */
    @TableField(value = "err_msg")
    private String errMsg;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

}
