/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 */
public class CountABCRecursively {

    public static void main(String[] args) {
        String str1="abcabcxxxabaor";
        int x=countAbcaba(str1);
        System.out.println(x);
    }

    private static int countAbcaba(String str1) {

        if(str1.length()<3) return 0;
        if(str1.substring(0,3).equals("abc")||str1.substring(0,3).equals("aba")){
            return 1+countAbcaba(str1.substring(1));
        }else{
            return countAbcaba(str1.substring(1));
        }

    }

}
