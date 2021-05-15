public class RotateString {
//output: countryilove
    public static void main(String[] args) {
        String str="ilovemycountry";
        String word="country";

        String sub1=word+str.substring(0,str.length()-word.length());
        System.out.println(sub1);




    }
}
