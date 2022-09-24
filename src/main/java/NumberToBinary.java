public class NumberToBinary {
    public static void main(String[] args) {
        System.out.println(getBinaryNumber(25));
    }

    public static String getBinaryNumber(int num){
        System.out.println( Integer.toBinaryString(num));
     //  return Integer.toBinaryString(num);
       //or
        String bin = "";

        while (num > 0){
            bin += num % 2;
            num /= 2;
        }
        return bin;


    }
}
