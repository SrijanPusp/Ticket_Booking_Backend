package ticket.booking.Util;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {
    public static String hashPassword(String plainPass){
        return BCrypt.hashpw(plainPass, BCrypt.gensalt());
    }

    public static boolean checkPass(String planePass, String hashedPass){
        return BCrypt.checkpw(planePass, hashedPass);
    }
}
