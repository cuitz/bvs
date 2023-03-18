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
 * 任务核查项结果表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
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
    @TableField("task_result_id")
    private Integer taskResultId;

    /**
     * 核查目标id
     */
    @TableField("target_id")
    private Integer targetId;

    /**
     * 核查项id
     */
    @TableField("item_id")
    private Integer itemId;

    /**
     * 原始采集结果
     */
    @TableField("raw_result")
    private String rawResult;

    /**
     * 检查结果（0合规 1不合规）
     */
    @TableField("check_result")
    private String checkResult;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public static final String ID = "id";

    public static final String TASK_RESULT_ID = "task_result_id";

    public static final String TARGET_ID = "target_id";

    public static final String ITEM_ID = "item_id";

    public static final String RAW_RESULT = "raw_result";

    public static final String CHECK_RESULT = "check_result";

    public static final String CREATE_TIME = "create_time";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
