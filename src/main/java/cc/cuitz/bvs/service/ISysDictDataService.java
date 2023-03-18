package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.SysDictData;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 字典数据表 服务类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
public interface ISysDictDataService extends IService<SysDictData> {
    PageInfo<SysDictData> findPage(Page<SysDictData> page);
}
