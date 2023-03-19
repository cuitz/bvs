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
 * 任务核查项结果表(TaskResultItem)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:35
 */
@Getter
@Setter
@TableName("task_result_item")
public class TaskResultItem extends Model<TaskResultItem> {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 任务记录id
     */
    @TableField(value = "task_result_id")
    private Integer taskResultId;

    /**
     * 核查目标id
     */
    @TableField(value = "target_id")
    private Integer targetId;

    /**
     * 核查项id
     */
    @TableField(value = "item_id")
    private Integer itemId;

    /**
     * 原始采集结果
     */
    @TableField(value = "raw_result")
    private String rawResult;

    /**
     * 检查结果（0合规 1不合规）
     */
    @TableField(value = "check_result")
    private String checkResult;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

}
