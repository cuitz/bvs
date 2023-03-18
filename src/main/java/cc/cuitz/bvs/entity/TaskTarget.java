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
 * 任务核查目标数据表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("task_target")
public class TaskTarget extends Model<TaskTarget> {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 任务id
     */
    @TableField("task_id")
    private Integer taskId;

    /**
     * 核查目标IP地址
     */
    @TableField("ip")
    private String ip;

    /**
     * 核查目标IP的数字类型值
     */
    @TableField("ip_number")
    private Long ipNumber;

    /**
     * 核查策略id
     */
    @TableField("strategy_id")
    private Integer strategyId;

    /**
     * 登录用户名
     */
    @TableField("username")
    private String username;

    /**
     * 登录用户密码
     */
    @TableField("password")
    private String password;

    public static final String ID = "id";

    public static final String TASK_ID = "task_id";

    public static final String IP = "ip";

    public static final String IP_NUMBER = "ip_number";

    public static final String STRATEGY_ID = "strategy_id";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
