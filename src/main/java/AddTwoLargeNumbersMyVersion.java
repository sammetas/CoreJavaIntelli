public class AddTwoLargeNumbersMyVersion {
    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "10019"; //res ==11253

        System.out.println(AddLargeNums(num1,num2));

    }

    private static String AddLargeNums(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
       StringBuilder res = new StringBuilder();
       int carry = 0;
        while (i >= 0 || j >=0){

            int t1 = (i >=0)? Integer.parseInt(""+num1.charAt(i)) :0;
            int t2 = (j >=0)? Integer.parseInt(""+num2.charAt(j) ):0;
            int tempSum = t1 + t2 + carry;

            carry = tempSum / 10;
          //  res.insert(0,tempSum%10);
            res.append(tempSum%10);
            i--;
            j--;

        }
        if (carry > 0){
            //res.insert(0,carry);
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
