package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.CheckPoint;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 检查点表(CheckPoint)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:12
 */
@Mapper
public interface CheckPointMapper extends BaseMapper<CheckPoint> {

}
