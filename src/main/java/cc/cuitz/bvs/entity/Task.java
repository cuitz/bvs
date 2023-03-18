package cc.cuitz.bvs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 任务记录表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("task")
public class Task extends Model<Task> {

    /**
     * 任务id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 任务名称
     */
    @TableField("name")
    private String name;

    /**
     * 创建人
     */
    @TableField("creator")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String CREATOR = "creator";

    public static final String CREATE_TIME = "create_time";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
