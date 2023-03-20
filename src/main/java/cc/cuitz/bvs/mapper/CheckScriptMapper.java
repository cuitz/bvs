package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.CheckScript;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 检查脚本表(CheckScript)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:29
 */
@Mapper
public interface CheckScriptMapper extends BaseMapper<CheckScript> {

}
