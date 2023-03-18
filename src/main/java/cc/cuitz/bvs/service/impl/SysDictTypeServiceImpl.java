package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysDictType;
import cc.cuitz.bvs.mapper.SysDictTypeMapper;
import cc.cuitz.bvs.service.SysDictTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 字典类型表(SysDictType)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@Service("sysDictTypeService")
public class SysDictTypeServiceImpl extends ServiceImpl<SysDictTypeMapper, SysDictType> implements SysDictTypeService {

}
