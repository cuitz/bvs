package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.SysDictType;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 字典类型表(SysDictType)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-19 22:06:12
 */
public interface SysDictTypeService extends IService<SysDictType> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<SysDictType> page(QueryParam<SysDictType> queryParam);
}
