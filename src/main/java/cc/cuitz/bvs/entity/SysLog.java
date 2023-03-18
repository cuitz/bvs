package cc.cuitz.bvs.entity;

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
 * 系统日志记录表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("sys_log")
public class SysLog extends Model<SysLog> {

    /**
     * 主键
     */
    @TableId("id")
    private Integer id;

    /**
     * 模块标题
     */
    @TableField("title")
    private String title;

    /**
     * 业务类型（0其它 1新增 2修改 3删除 4下载）
     */
    @TableField("business_type")
    private String businessType;

    /**
     * 用户账号
     */
    @TableField("username")
    private String username;

    /**
     * 请求方式（get/post/delete/...）
     */
    @TableField("request_method")
    private String requestMethod;

    /**
     * 请求URL
     */
    @TableField("request_url")
    private String requestUrl;

    /**
     * 请求参数
     */
    @TableField("request_param")
    private String requestParam;

    /**
     * 响应参数
     */
    @TableField("response_param")
    private String responseParam;

    /**
     * 操作状态（0正常 1异常）
     */
    @TableField("status")
    private String status;

    /**
     * 错误信息
     */
    @TableField("err_msg")
    private String errMsg;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public static final String ID = "id";

    public static final String TITLE = "title";

    public static final String BUSINESS_TYPE = "business_type";

    public static final String USERNAME = "username";

    public static final String REQUEST_METHOD = "request_method";

    public static final String REQUEST_URL = "request_url";

    public static final String REQUEST_PARAM = "request_param";

    public static final String RESPONSE_PARAM = "response_param";

    public static final String STATUS = "status";

    public static final String ERR_MSG = "err_msg";

    public static final String CREATE_TIME = "create_time";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
