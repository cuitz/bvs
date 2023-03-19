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
 * 检查项表(CheckItem)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:33
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
    @TableField(value = "strategy_id")
    private Integer strategyId;

    /**
     * 检查项名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 检查项描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 检查方法
     */
    @TableField(value = "check_method")
    private String checkMethod;

    /**
     * 修复方案
     */
    @TableField(value = "repair_plan")
    private String repairPlan;

    /**
     * 判断公式
     */
    @TableField(value = "formula")
    private String formula;

}
