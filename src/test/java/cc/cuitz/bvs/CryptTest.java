package cc.cuitz.bvs;

import cc.cuitz.bvs.constants.BvsConstants;
import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.BCrypt;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
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
        SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, BvsConstants.AES_KEY.getBytes());
        String encryptBase64 = aes.encryptBase64("123456");
        System.out.println(encryptBase64);
        System.out.println(aes.decryptStr(encryptBase64));
    }

    private void bcrypt(String password) {
        String salt = BCrypt.gensalt();
        String hashed = BCrypt.hashpw(password, salt);
        System.out.println("salt:" + salt);
        System.out.println("hashed:" + hashed);
    }
}
