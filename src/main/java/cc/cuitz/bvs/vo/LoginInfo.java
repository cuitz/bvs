package cc.cuitz.bvs.vo;

import cc.cuitz.bvs.entity.SysMenu;
import cn.dev33.satoken.stp.SaTokenInfo;
import lombok.Data;

import java.util.List;

@Data
public class LoginInfo {
    private SaTokenInfo tokenInfo;

    private List<SysMenu> menus;
}

