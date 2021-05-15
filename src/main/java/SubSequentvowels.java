public class SubSequentvowels {
    /*
    Input :  str = "aeiaaioooaauuaeiou"
    Output :  {a, a, a, a, a, a, e, i, o, u}
    There are two possible outputs in this case:
        {a, a, a, a, a, a, e, i, o, u} and,
        {a, e, i, i, o, o, o, u, u, u}
        each of length 10

Input : str = "aaauuiieeou"
Output : No subsequence possible
     */

    public static void main(String[] args) {
        String str = "aeiaaioooaauuaeiou";

        String base="aeiou";

int j=0;
String result="";
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==base.charAt(j%5)){
                result+=str.charAt(i);

            }else{

            }

        }

    }
}
