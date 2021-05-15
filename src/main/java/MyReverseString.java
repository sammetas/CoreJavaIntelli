public class MyReverseString {
    public static void main(String[] args) {
        reverseIt("apple");

    }

    private static void reverseIt(String str) {

        if(str.length()<=1 ||str==null){
            System.out.println(str);
        }else {

                System.out.print(str.charAt(str.length()-1));
                reverseIt(str.substring(0,str.length()-1));

        }
    }
}
