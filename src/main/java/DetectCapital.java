public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(findCapital("ALLCAPITAL")); //should return true
        System.out.println(findCapital("Firstlettercapital")); //should return true
        System.out.println(findCapital("nocapital")); //should return true
        System.out.println(findCapital("IoUAe")); //should return false
    }

    private static boolean findCapital(String s) {
        int capitalCount = 0;
        for (Character c : s.toCharArray()) {
            if (Character.isUpperCase(c)) capitalCount++;
        }
        if (capitalCount == 0 ||
                (capitalCount == 1 && Character.isUpperCase(s.charAt(0))) ||
                capitalCount == s.length()) {
            return true;
        }


        return false;
    }


}
