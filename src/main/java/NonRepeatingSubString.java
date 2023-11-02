import java.util.HashMap;

public class NonRepeatingSubString {
    public static void main(String[] args) {
        //find length of non repeating string in a n string
        //  String str = "ababcdebdijklmnopkf";
        String str = "ababcdebdijklmnopkf";
        System.out.println(findLengthOfNonRep(str));
        System.out.println(findLengthOfnonRepV1(str));
    }

    private static int findLengthOfnonRepV1(String str) {
        int max = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c) && map.get(c) >= j) {
               j = map.get(c) + 1;

            }
            map.put(c, i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    private static int findLengthOfNonRep(String str) {


        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            StringBuffer sb = new StringBuffer();

            for (int j = i; j < str.length(); j++) {
                if (sb.toString().contains(String.valueOf(str.charAt(j)))) {
                    break;

                }
                sb.append(str.charAt(j));
                max = Math.max(sb.length(), max);

            }

        }

        return max;
}

    }
