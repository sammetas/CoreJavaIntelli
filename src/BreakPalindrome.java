import java.util.TreeMap;

public class BreakPalindrome {

    public static void main(String[] args) {

        String str="aaabbaaa";
        //System.out.println(str.replace('b','z'));
        TreeMap<String,Integer> map= new TreeMap<>();
        for(int i=0;i<str.length()/2;i++){
            char ch=str.charAt(i);

            if(ch>'a' && ch<='z'){
            String newStr=getNewStr(ch,i,str);
                System.out.println("new---->"+newStr);
               // if(!isPalindrome(newStr)) {
                    map.put(newStr, 1);
             //   }

            }


        }
        if(map.size()>0)
        System.out.println(map.ceilingEntry("1").getKey());
        else {
            System.out.println("IMPOSSIBLE");
        }
    }

    private static boolean isPalindrome(String newStr) {
        int i=0;int j=newStr.length()/2;
        while (i<j){
            if(newStr.charAt(i++)!=newStr.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    private static String getNewStr(char ch, int i, String str) {

      //  return str.substring(0,i)+(char)((int)ch-1)+str.substring(i+1,str.length());
        return str.substring(0,i)+'a'+str.substring(i+1,str.length());
    }
}
