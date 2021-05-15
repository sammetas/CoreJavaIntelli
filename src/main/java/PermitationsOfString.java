public class PermitationsOfString {
    public static void main(String[] args) {
        String str="ABC";

        printPerf(str,"");
    }

    private static void printPerf(String str, String s) {

        if(str.length()==0){
            System.out.print(s+" ,");
        }

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            String ros=str.substring(0,i)+str.substring(i+1);
            printPerf(ros,s+ch);
        }
    }
}
