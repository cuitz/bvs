package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.CheckPoint;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 检查点表(CheckPoint)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:08
 */
public interface CheckPointService extends IService<CheckPoint> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<CheckPoint> page(QueryParam<CheckPoint> queryParam);
}
