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
 * 检查点表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("check_point")
public class CheckPoint extends Model<CheckPoint> {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 检查项id
     */
    @TableField("item_id")
    private Integer itemId;

    /**
     * 检查点名称
     */
    @TableField("name")
    private String name;

    /**
     * 运算符
     */
    @TableField("operator")
    private String operator;

    /**
     * 基准值
     */
    @TableField("benchmark_value")
    private String benchmarkValue;

    /**
     * 正则表达式
     */
    @TableField("regular")
    private String regular;

    public static final String ID = "id";

    public static final String ITEM_ID = "item_id";

    public static final String NAME = "name";

    public static final String OPERATOR = "operator";

    public static final String BENCHMARK_VALUE = "benchmark_value";

    public static final String REGULAR = "regular";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
