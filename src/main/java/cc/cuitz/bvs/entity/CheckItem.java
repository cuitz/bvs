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
 * 检查项表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("check_item")
public class CheckItem extends Model<CheckItem> {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 检查策略id
     */
    @TableField("strategy_id")
    private Integer strategyId;

    /**
     * 检查项名称
     */
    @TableField("name")
    private String name;

    /**
     * 检查项描述
     */
    @TableField("description")
    private String description;

    /**
     * 检查方法
     */
    @TableField("check_method")
    private String checkMethod;

    /**
     * 修复方案
     */
    @TableField("repair_plan")
    private String repairPlan;

    /**
     * 判断公式
     */
    @TableField("formula")
    private String formula;

    public static final String ID = "id";

    public static final String STRATEGY_ID = "strategy_id";

    public static final String NAME = "name";

    public static final String DESCRIPTION = "description";

    public static final String CHECK_METHOD = "check_method";

    public static final String REPAIR_PLAN = "repair_plan";

    public static final String FORMULA = "formula";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
