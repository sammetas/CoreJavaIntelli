public class RecursiveRevString {
static int i=0;
    public static void main(String[] args) {
        String str="CAPS";

        String revStr=reverse(str);
        System.out.println(revStr);
    }

    private static String reverse(String str) {

        if(str.length()==0){
            return  str;
        }
       // System.out.println(str.substring(1)+" "+i++ +" "+str.charAt(0));
        return reverse(str.substring(1)) + str.charAt(0);
    }

    private static int fact(int n){
        if(n==0) return 1;

        return n*fact(n-1);
    }
}
