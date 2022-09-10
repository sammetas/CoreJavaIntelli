/*
  A simple expression is given in words , "onenineplusonezero"
  Expected output will be 19+10 =  29. It should work for plus ,minus as of now .
 */


import java.util.HashMap;
import java.util.Map;

public class StringMathExample {
    public static void main(String[] args) {

        String str = "onenineplusonezero";
        //replace all names with numbeers.

        str = replaceNames(str,"one");
        str = replaceNames(str,"two");
        str = replaceNames(str,"three");
        str = replaceNames(str,"four");
        str = replaceNames(str,"five");
        str = replaceNames(str,"six");
        str = replaceNames(str,"seven");
        str = replaceNames(str,"eight");
        str = replaceNames(str,"nine");
        str = replaceNames(str,"zero");
        //operation if it contains plus do addition
        if(str.contains("plus")){
            int x =  Integer.parseInt(str.substring(0,str.indexOf("plus")));
            int y = Integer.parseInt(str.substring(str.indexOf("plus")+4,str.length()));
            System.out.println(x+y);
        }else if (str.contains("minus")){
            int x =  Integer.parseInt(str.substring(0,str.indexOf("minus")));
            int y = Integer.parseInt(str.substring(str.indexOf("minus")+4),str.length());
            System.out.println(x-y);
        }
    }

    private static String replaceNames(String str, String key) {

        Map<String,String> map = new HashMap<>();
        map.put("one","1");map.put("two","2");
        map.put("three","3");map.put("four","4");
        map.put("five","5");map.put("six","6");
        map.put("seven","7");map.put("eight","8");
        map.put("nine","9");map.put("zero","0");
        return str.replaceAll(key,map.get(key)); //this will replace 1 for all one places

    }
}
