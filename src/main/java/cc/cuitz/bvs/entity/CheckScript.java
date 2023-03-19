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
 * 检查脚本表(CheckScript)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
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
    @TableField(value = "strategy_id")
    private Integer strategyId;

    /**
     * 脚本名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 脚本内容
     */
    @TableField(value = "content")
    private String content;

}
