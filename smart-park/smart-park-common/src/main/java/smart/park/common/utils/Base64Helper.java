package smart.park.common.utils;

import java.util.Base64;

public class Base64Helper {

    public static byte[] decode(String data){
        return Base64.getMimeDecoder().decode(data);
    }

    public static String encodeToString(byte[] data){
        return Base64.getMimeEncoder().encodeToString(data);
    }

}
