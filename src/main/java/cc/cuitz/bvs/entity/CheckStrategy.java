package cc.cuitz.bvs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

/**
 * 核查策略表(CheckStrategy)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
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
    @TableField(value = "name")
    private String name;

}
