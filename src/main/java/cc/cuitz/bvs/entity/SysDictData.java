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
 * 字典数据表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
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
    @TableField("dict_code")
    private Integer dictCode;

    /**
     * 字典值
     */
    @TableField("dict_value")
    private String dictValue;

    /**
     * 字典键值
     */
    @TableField("dict_key")
    private String dictKey;

    /**
     * 字典排序
     */
    @TableField("dict_sort")
    private Integer dictSort;

    /**
     * 字典类型
     */
    @TableField("dict_type")
    private String dictType;

    public static final String ID = "id";

    public static final String DICT_CODE = "dict_code";

    public static final String DICT_VALUE = "dict_value";

    public static final String DICT_KEY = "dict_key";

    public static final String DICT_SORT = "dict_sort";

    public static final String DICT_TYPE = "dict_type";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
