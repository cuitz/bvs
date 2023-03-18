package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.mapper.SysDictDataMapper;
import cc.cuitz.bvs.service.ISysDictDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 字典数据表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements ISysDictDataService {

    @Autowired
    private SysDictDataMapper sysDictDataMapper;

    @Override
    public PageInfo<SysDictData> findPage(Page<SysDictData> page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<SysDictData> data = sysDictDataMapper.selectList(null);
        return PageInfo.of(data);
    }
}
