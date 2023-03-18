package cc.cuitz.bvs.mapper;

import cc.cuitz.bvs.entity.SysDictData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字典数据表(SysDictData)数据库访问层
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@Mapper
public interface SysDictDataMapper extends BaseMapper<SysDictData> {

}
