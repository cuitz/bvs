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
 * 报表记录表(Report)实体类
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:29
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
    @TableField(value = "task_result_id")
    private Integer taskResultId;

    /**
     * 报表名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 报表状态（0等待生成 1生成中 2生成完成 3生成失败）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 生成的报表文件类型（0:docx,1:xlsx）
     */
    @TableField(value = "file_type")
    private String fileType;

    /**
     * 报表文件存储路径
     */
    @TableField(value = "path")
    private String path;

    /**
     * 下载次数
     */
    @TableField(value = "download_number")
    private Integer downloadNumber;

    /**
     * 创建人
     */
    @TableField(value = "creator")
    private String creator;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

}
