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
 * 任务结果表(TaskResult)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:13
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
    @TableField(value = "task_id")
    private Integer taskId;

    /**
     * 任务状态（0等待 1执行中 2暂停 3停止 4完成 5失败）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 任务进度
     */
    @TableField(value = "progress")
    private Integer progress;

    /**
     * 执行开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 执行结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 执行耗时，单位秒
     */
    @TableField(value = "time_spend")
    private Integer timeSpend;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

}
