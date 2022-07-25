import java.math.BigDecimal;
import java.util.Scanner;

public class AgileSearch1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(0);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        int[] res = new int[n];

        for(int i=0;i<n;i++) {
             str[i] = scanner.next();
        }

        for(int i=0;i<str.length;i++){
         if(!str[i].matches("[0-9]+")){
             System.out.println("Number format error");
         }else{
             res[i] = str[i].length();
         }
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
}
