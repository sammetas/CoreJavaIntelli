import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
int count=0;
String str="";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(haystack));
            if (haystack != null) {
                while ((str = reader.readLine()) != null) {
                   if(str.contains(needle))count++;
                }
            }
        } finally {
            try { haystack.close(); } catch (Throwable ignore) {}
        }

return  count;
    }
    
    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}