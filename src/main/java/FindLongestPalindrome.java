

public class FindLongestPalindrome {
    int resultLength;
    int resultStart;
    public static void main(String[] args) {
       System.out.println(findLongestPalindromeInGivenString("abcdefmalayalamoeunfmadam"));
        System.out.println(new FindLongestPalindrome().findLongestPalindromeInGivenStringAdvanced("abcdefmalayalamoeunfmadami"));
    }
    public   int    findLongestPalindromeInGivenStringAdvanced(String str){
        int stringLength = str.length();
        if(stringLength < 2 ) return str.length();
        for(int start =0; start < stringLength - 1; start++){
            expandRange(str,start,start);
            expandRange(str,start,start + 1);
        }
        System.out.println(str.substring(resultStart,resultStart + resultLength));
        return resultLength;
    }

    private  void expandRange(String str, int start, int end) {

        while (start >=0 && end <= str.length() - 1 && str.charAt(start) == str.charAt(end)){
            start --;
            end ++ ;
        }

        if( resultLength < (end - start -1)){
            resultLength = end - start -1 ;
            resultStart = start +1;
        }

    }

    public static int    findLongestPalindromeInGivenString(String str){
        int max = Integer.MIN_VALUE;
        String palindrom ="";
        for(int i=0; i< str.length();i++){
            for(int j=i+1; j<str.length();j++){
                 if(isPalindrome(str.substring(i,j+1))){
                     max = Math.max(max,Math.abs( i-j)+1);
                     palindrom = str.substring(i,j+1);
                   //  System.out.println(palindrom);
                 }
            }
        }
        return max;
    }

    private static boolean isPalindrome(String substring) {
        int j=substring.length()-1;
        for(int i = 0; i < j ; i++, j--){
            if (substring.charAt(i) != substring.charAt(j)){
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(String substring,int i,int j) {

        for(; i < j ; i++, j--){
            if (substring.charAt(i) != substring.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
