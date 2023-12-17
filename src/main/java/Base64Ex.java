import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


public class Base64Ex {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String str = Base64.getEncoder().encodeToString("103060000901".getBytes());
        System.out.println(new String(Base64.getDecoder().decode("MTAzMDYwMDAwOTAxwith".getBytes())));
        System.out.println(str +"with length:"+str.length());
        MessageDigest md = MessageDigest.getInstance("MD5");





    }
}
