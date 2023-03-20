package cc.cuitz.bvs;

import cc.cuitz.bvs.util.AESUtil;
import cn.hutool.crypto.digest.BCrypt;
import org.junit.jupiter.api.Test;

/**
 * @author cuitongzhe
 * @date 2023/3/20
 */
public class CryptTest {

    @Test
    void test() {
        bcrypt("operator");
        bcrypt("useradmin");
        bcrypt("auditor");
    }

    @Test
    void testAES() {
        String encryptBase64 = AESUtil.encryptBase64("123456");
        System.out.println(encryptBase64);
        String decryptStr = AESUtil.decryptStr(encryptBase64);
        System.out.println(decryptStr);
    }

    private void bcrypt(String password) {
        String salt = BCrypt.gensalt();
        String hashed = BCrypt.hashpw(password, salt);
        System.out.println("salt:" + salt);
        System.out.println("hashed:" + hashed);
    }
}
