package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.CheckScript;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 检查脚本表(CheckScript)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:29
 */
public interface CheckScriptService extends IService<CheckScript> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<CheckScript> page(QueryParam<CheckScript> queryParam);
}
