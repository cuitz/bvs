package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.vo.common.PageParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 字典数据表(SysDictData)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
public interface SysDictDataService extends IService<SysDictData> {
    PageInfo<SysDictData> page(PageParam pageParam, SysDictData condition);
}
