/*
   how to get the index of a given str in the string (0r)
   replicate str.indexOf() method.
 */
public class StringIndexValue {
    public static void main(String[] args) {
        String str = "Hello worldandsome";
         String indexFor = "world";

            int index = getIndexOf(indexFor.toCharArray(),indexFor.length(),str.toCharArray(),str.length());
        System.out.println(index);
      //  System.out.println(str.substring(getIndexOf(indexFor.toCharArray(),indexFor.length(),str.toCharArray(),str.length()),str.length()));



    }

    private static int getIndexOf(char[] indexFor,int lenIndex ,char[] str , int strLen) {

        int len = strLen-lenIndex;
        char firstChar  =  indexFor[0];

        for(int i=0; i<=len;i++){
                if(str[i] == firstChar){
                    int j=i+1; int k=0;
                    while(k<lenIndex-1 && str[j++] == indexFor[++k]){

                    }
                    if(k == lenIndex-1) return i;
             }
        }
        return -1;



    }
}
