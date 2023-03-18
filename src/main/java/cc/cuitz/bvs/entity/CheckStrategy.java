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
 * 核查策略表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("check_strategy")
public class CheckStrategy extends Model<CheckStrategy> {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 策略名称
     */
    @TableField("name")
    private String name;

    public static final String ID = "id";

    public static final String NAME = "name";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
