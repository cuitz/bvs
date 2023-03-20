package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.CheckStrategy;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 核查策略表(CheckStrategy)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:29
 */
@Mapper
public interface CheckStrategyMapper extends BaseMapper<CheckStrategy> {

}
