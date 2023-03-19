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
 * 任务核查目标数据表(TaskTarget)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:35
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
    @TableField(value = "task_id")
    private Integer taskId;

    /**
     * 核查目标IP地址
     */
    @TableField(value = "ip")
    private String ip;

    /**
     * 核查目标IP的数字类型值
     */
    @TableField(value = "ip_number")
    private Long ipNumber;

    /**
     * 核查策略id
     */
    @TableField(value = "strategy_id")
    private Integer strategyId;

    /**
     * 登录用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 登录用户密码
     */
    @TableField(value = "password")
    private String password;

}
