import java.util.LinkedList;

public class CommonDivisorInaString {
    public static void main(String[] args) {

        String str1="helloworldabcdefgoeir";
        String str2="alskdfhabcdefg980s9dfh";
 String cdiv="";
        String maxSub="";

        for(int i=0;i<str1.length();i++){
            int j=0;

            while(j<str2.length()){
                if(str1.charAt(i)==str2.charAt(j)){
                    cdiv+=str2.charAt(j);

                  if(i<str1.length()-1)  i++;

                }else {
                   //  i=j;
                    if(maxSub.length()<cdiv.length()){
                       maxSub=cdiv;
                    }
                    cdiv="";
                }
                if(maxSub.length()<cdiv.length()){
                    maxSub=cdiv;
                }
                j++;
            }


        }
        System.out.println(maxSub);


    }

}
