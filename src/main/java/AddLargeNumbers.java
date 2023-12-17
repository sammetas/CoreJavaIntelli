public class AddLargeNumbers {

    public static void main(String[] args) {
        String a = "189";
        String b = "123";
        StringBuilder sb  = new StringBuilder();
        sb.insert(0,"a");
        sb.insert(0,"b");
        System.out.println(sb.toString());

        System.out.println();
        String sum = add(a, b);

        System.out.println("Sum: " + sum);
    }

    static String add(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
          //  int x = (i >= 0) ? a.charAt(i) - '0' : 0;
           // int y = (j >= 0) ? b.charAt(j) - '0' : 0;
            int x = 0;
            int y =0;
            if(i >=0) {
               x = Integer.parseInt("" + a.charAt(i));
            }
            if(j >= 0) {
                 y = Integer.parseInt("" + b.charAt(j));
            }

            int tempSum = x + y + carry;
            carry = tempSum / 10;
            //result.insert(0, tempSum % 10);
            result.append(tempSum % 10);

            i--;
            j--;
        }

        if (carry > 0) {
         //   result.insert(0, carry);
            result.append( carry);
        }

        return result.reverse().toString();
    }
}
