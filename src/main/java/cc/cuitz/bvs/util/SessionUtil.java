package cc.cuitz.bvs.util;

import cc.cuitz.bvs.entity.SysUser;
import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.StpUtil;
import lombok.experimental.UtilityClass;

/**
 * @author cuitongzhe
 * @date 2023/3/20
 */
@UtilityClass
public class SessionUtil {

    /**
     * 当前用户
     *
     * @return
     */
    public static SysUser currentUser() {
        return (SysUser) StpUtil.getSession().get(SaSession.USER);
    }
}
