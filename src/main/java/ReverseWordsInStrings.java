import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseWordsInStrings {
    public static void main(String[] args) {
        System.out.println(reverseWorks("hello worlds "));
    }

    private static String reverseWorks(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(s," ");
        while (stringTokenizer.hasMoreTokens()){

           list.add(stringTokenizer.nextToken().trim());
        }
        System.out.println(list);
       for(int i= list.size()-1; i >= 0 ;i --){
           sb.append(list.get(i)).append(" ");
       }
        return  sb.toString().trim();
    }


}
