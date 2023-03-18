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
 * 报表记录表
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Getter
@Setter
@TableName("report")
public class Report extends Model<Report> {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 任务结果ID
     */
    @TableField("task_result_id")
    private Integer taskResultId;

    /**
     * 报表名称
     */
    @TableField("name")
    private String name;

    /**
     * 报表状态（0等待生成 1生成中 2生成完成 3生成失败）
     */
    @TableField("status")
    private String status;

    /**
     * 生成的报表文件类型（0:docx,1:xlsx）
     */
    @TableField("file_type")
    private String fileType;

    /**
     * 报表文件存储路径
     */
    @TableField("path")
    private String path;

    /**
     * 下载次数
     */
    @TableField("download_number")
    private Integer downloadNumber;

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

    public static final String TASK_RESULT_ID = "task_result_id";

    public static final String NAME = "name";

    public static final String STATUS = "status";

    public static final String FILE_TYPE = "file_type";

    public static final String PATH = "path";

    public static final String DOWNLOAD_NUMBER = "download_number";

    public static final String CREATOR = "creator";

    public static final String CREATE_TIME = "create_time";

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
