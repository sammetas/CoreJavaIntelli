import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "listens";
        String str2 = "silents";

        Map<Character,Long> mapStr1 = str1.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapStr1);
        Map<Character,Long> mapStr2 = str2.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Character::charValue,Collectors.counting()));
        System.out.println(mapStr2);
        System.out.println(mapStr1.equals(mapStr2));

    }
}
