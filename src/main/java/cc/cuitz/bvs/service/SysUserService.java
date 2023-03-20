package cc.cuitz.bvs.service;

import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.vo.common.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * 用户表(SysUser)服务接口
 *
 * @author cuitongzhe
 * @since 2023-03-20 09:39:30
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    PageInfo<SysUser> page(QueryParam<SysUser> queryParam);
}
