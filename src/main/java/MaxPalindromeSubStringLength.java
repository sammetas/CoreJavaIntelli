import java.util.Objects;

public class MaxPalindromeSubStringLength {
     int max;
     int start;

     public int findMaxSubStrPalindrome(String str){

         if(Objects.isNull(str) || str.length() ==0 ){
             return 0;
         }

         for(int i=0; i<str.length() -1 ; i ++) {
             findSubStringPalin(str, i, i);
             findSubStringPalin(str,i,i + 1);
         }
         return max;

     }

    private void findSubStringPalin(String str, int start, int end) {

         while (  start >= 0 && end <= str.length() -1 && str.charAt(start) == str.charAt(end)){
            start --;
            end ++;
         }
         max = Math.max(max,end - start - 1);
    }

    public static void main(String[] args) {
        System.out.println(new MaxPalindromeSubStringLength().findMaxSubStrPalindrome("madaymalaymadamalam"));
    }
}
