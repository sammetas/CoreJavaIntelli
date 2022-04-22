/*
find out the common words between a and b  strings
 */
public class EpamStrings {
    public static void main(String[] args) {
        String a="aworldthing";
        String b="othings";

        //int j=0;
        String sub="";
        for(int i=0;i<a.length();i++){
    int j=0;sub="";
            while (j<b.length()-1){

                if(a.charAt(i)==b.charAt(j)){


                    sub+=b.charAt(j);
                    i++;

                }

            j++;
            }


        }
        System.out.println(sub);
    }
}
