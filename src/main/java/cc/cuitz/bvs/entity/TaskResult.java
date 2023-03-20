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
 * @since 2023-03-20 15:23:09
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
     * 任务状态:task_status
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
