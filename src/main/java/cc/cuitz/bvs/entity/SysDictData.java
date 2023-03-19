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
 * 字典数据表(SysDictData)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Getter
@Setter
@TableName("sys_dict_data")
public class SysDictData extends Model<SysDictData> {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 字典编码
     */
    @TableField(value = "dict_code")
    private Integer dictCode;

    /**
     * 字典值
     */
    @TableField(value = "dict_value")
    private String dictValue;

    /**
     * 字典键值
     */
    @TableField(value = "dict_key")
    private String dictKey;

    /**
     * 字典排序
     */
    @TableField(value = "dict_sort")
    private Integer dictSort;

    /**
     * 字典类型
     */
    @TableField(value = "dict_type")
    private String dictType;

}
