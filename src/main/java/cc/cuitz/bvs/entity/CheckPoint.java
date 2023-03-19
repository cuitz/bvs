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
 * 检查点表(CheckPoint)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
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
    @TableField(value = "item_id")
    private Integer itemId;

    /**
     * 检查点名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 运算符
     */
    @TableField(value = "operator")
    private String operator;

    /**
     * 基准值
     */
    @TableField(value = "benchmark_value")
    private String benchmarkValue;

    /**
     * 正则表达式
     */
    @TableField(value = "regular")
    private String regular;

}
