public class EpamStrings {
    public static void main(String[] args) {
        String a="aworldthing";
        String b="hworld";

        //int j=0;
        String sub="";
        for(int i=0;i<a.length();i++){
    int j=0;
            while (j<b.length()){

                if(a.charAt(i)==b.charAt(j)){


                    sub+=b.charAt(j);
                    i++;

                }else {

                    if(sub.length()>0)
                    System.out.println(sub);

                   // break;


                }

            j++;
            }


        }
        System.out.println(sub);
    }
}
