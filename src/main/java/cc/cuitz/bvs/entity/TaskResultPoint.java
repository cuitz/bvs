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
 * 任务检查点结果表(TaskResultPoint)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:10
 */
@Getter
@Setter
@TableName("task_result_point")
public class TaskResultPoint extends Model<TaskResultPoint> {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 检查项结果id
     */
    @TableField(value = "result_item_id")
    private Integer resultItemId;

    /**
     * 检查点id
     */
    @TableField(value = "point_id")
    private Integer pointId;

    /**
     * 检查点采集结果
     */
    @TableField(value = "raw_result")
    private String rawResult;

    /**
     * 检查点合规结果（0合规 1不合规）
     */
    @TableField(value = "check_result")
    private String checkResult;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

}
