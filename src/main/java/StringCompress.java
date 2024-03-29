public class StringCompress {
    public static void main(String[] args) {
        String str = "aaabbcddd"; //expected output will be a3b2c1d4p4
        System.out.println(compressString(str));
        System.out.println(compress(str,0));
        System.out.println( compressV2("aabbccc".toCharArray()));
    }
    public static  int compressV2(char[] chars) {
        System.out.println("1:::"+new String(chars));
        if(chars.length == 1) return 1;

        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<chars.length;i++){
            if(i+1 >= chars.length || chars[i] != chars[i+1]){
                sb.append(chars[i]).append(count);
                count = 0;
            }
            count++;
        }
        chars = new char[sb.length()];
        for(int i =0 ; i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        System.out.println("2:::"+new String(chars));
        return chars.length;
    }
    private static String compressString(String str) {

        int count = 1;
        StringBuilder sb  = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i)).append(count);
                count = 0;

            }
            count ++;
        }
return sb.toString();
    }

    public static String compress(String str,int i){
        StringBuilder sb = new StringBuilder();
        int count =1;
        if (i>= str.length() )
            return sb.append(str.charAt(i-1)).append(count).toString();

         while (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
             count++;
             i++;
         }

         return sb.append(str.charAt(i)).append(count) + compress(str,i+1);
    }

}
