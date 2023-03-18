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
 * 任务检查点结果表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
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
    @TableField("result_item_id")
    private Integer resultItemId;

    /**
     * 检查点id
     */
    @TableField("point_id")
    private Integer pointId;

    /**
     * 检查点采集结果
     */
    @TableField("raw_result")
    private String rawResult;

    /**
     * 检查点合规结果（0合规 1不合规）
     */
    @TableField("check_result")
    private String checkResult;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public static final String ID = "id";

    public static final String RESULT_ITEM_ID = "result_item_id";

    public static final String POINT_ID = "point_id";

    public static final String RAW_RESULT = "raw_result";

    public static final String CHECK_RESULT = "check_result";

    public static final String CREATE_TIME = "create_time";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
