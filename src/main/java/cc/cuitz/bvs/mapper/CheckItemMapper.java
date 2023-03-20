package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.CheckItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 检查项表(CheckItem)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:08
 */
@Mapper
public interface CheckItemMapper extends BaseMapper<CheckItem> {

}
