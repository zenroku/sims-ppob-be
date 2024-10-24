package co.id.zahir.nutech.simsppob.core.util;

import org.mindrot.jbcrypt.BCrypt;

public class HashPassUtil {
    public static String hash(String pwd){
        return BCrypt.hashpw(pwd, BCrypt.gensalt());
    }

    public static boolean isMatched(String pwd,String hashedPwd) {
        return BCrypt.checkpw(pwd,hashedPwd);
    }
}
