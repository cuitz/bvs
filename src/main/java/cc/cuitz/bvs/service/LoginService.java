package cc.cuitz.bvs.service;

import cc.cuitz.bvs.vo.LoginInfo;
import cc.cuitz.bvs.vo.LoginParam;

import javax.security.auth.login.FailedLoginException;

public interface LoginService {
     LoginInfo login(LoginParam loginParam) throws FailedLoginException;
}
