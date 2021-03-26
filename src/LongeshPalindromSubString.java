/*
 to find a longest palindrome sub string from a given string
 */

public class LongeshPalindromSubString {
int resultStart;
int resultLength;
    public static void main(String[] args) {
        LongeshPalindromSubString p= new LongeshPalindromSubString();
        String str="abaio1001";

        System.out.println(p.getLongestPalindrom(str));
    }

    private  String   getLongestPalindrom(String str) {

         for(int start=0;start<str.length()-1;start++){
             expandRange(str,start,start);
             expandRange(str,start,start+1);
             //System.out.println(str.substring(resultStart,resultStart+resultLength));
         }
         return str.substring(resultStart,resultStart+resultLength);

    }

    private   void expandRange(String str, int begin, int end) {


        while(begin>=0&&end<str.length() && str.charAt(begin)==str.charAt(end)){
            begin--;
            end++;
        }

        if(resultLength < end-begin-1 ){
            resultStart=begin+1;
            resultLength=end-begin-1;
        }
    }
}

