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
 * 检查脚本表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("check_script")
public class CheckScript extends Model<CheckScript> {

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
     * 脚本名称
     */
    @TableField("name")
    private String name;

    /**
     * 脚本内容
     */
    @TableField("content")
    private String content;

    public static final String ID = "id";

    public static final String STRATEGY_ID = "strategy_id";

    public static final String NAME = "name";

    public static final String CONTENT = "content";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
