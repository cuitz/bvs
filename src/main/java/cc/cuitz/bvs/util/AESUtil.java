package cc.cuitz.bvs.util;

import cc.cuitz.bvs.constants.BvsConstants;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import lombok.experimental.UtilityClass;

/**
 * @author cuitongzhe
 * @date 2023/3/20
 */
@UtilityClass
public class AESUtil {
    private static final SymmetricCrypto aes;

    static {
        aes = new SymmetricCrypto(SymmetricAlgorithm.AES, BvsConstants.AES_KEY.getBytes());
    }

    public static String encryptBase64(String data) {
        return aes.encryptBase64(data);
    }

    public static String decryptStr(String data) {
        return aes.decryptStr(data);
    }
}
