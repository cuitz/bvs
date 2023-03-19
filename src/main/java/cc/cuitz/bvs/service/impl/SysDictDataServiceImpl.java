package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.mapper.SysDictDataMapper;
import cc.cuitz.bvs.service.SysDictDataService;
import cc.cuitz.bvs.vo.common.PageParam;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * 字典数据表(SysDictData)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("sysDictDataService")
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements SysDictDataService {

    @Override
    public PageInfo<SysDictData> page(PageParam pageParam, SysDictData condition) {
        return null;
    }
}
