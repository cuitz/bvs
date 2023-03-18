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
 * 任务结果表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("task_result")
public class TaskResult extends Model<TaskResult> {

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
     * 任务状态（0等待 1执行中 2暂停 3停止 4完成 5失败）
     */
    @TableField("status")
    private String status;

    /**
     * 任务进度
     */
    @TableField("progress")
    private Integer progress;

    /**
     * 执行开始时间
     */
    @TableField("start_time")
    private Date startTime;

    /**
     * 执行结束时间
     */
    @TableField("end_time")
    private Date endTime;

    /**
     * 执行耗时，单位秒
     */
    @TableField("time_spend")
    private Integer timeSpend;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public static final String ID = "id";

    public static final String TASK_ID = "task_id";

    public static final String STATUS = "status";

    public static final String PROGRESS = "progress";

    public static final String START_TIME = "start_time";

    public static final String END_TIME = "end_time";

    public static final String TIME_SPEND = "time_spend";

    public static final String CREATE_TIME = "create_time";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
