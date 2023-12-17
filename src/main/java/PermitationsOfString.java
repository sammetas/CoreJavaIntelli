public class PermitationsOfString {
    public static void main(String[] args) {
        String str="ABC";

        //printPerf(str,"");
        permutations(str.toCharArray(),0,str.length() -1 );
    }

    private static void printPerf(String str, String s) {

        if(str.length()==0){
            System.out.print(s+" ,");
        }

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            String ros = str.substring(0,i) + str.substring(i+1);
            printPerf(ros,s+ch);
        }
    }

    private  static void permutations(char[] str, int start, int end){

        if(start == end){
            System.out.println(new String(str));
        }else{
            for(int i =  start; i <= end; i++){
                swap(str,start,i);
                permutations(str, start + 1, end);
                swap(str, start,i);

            }
        }

    }

    private static void swap(char[] str, int start, int i) {
        char t = str[start];
        str[start] = str[i];
        str[i] = t;
    }

}
