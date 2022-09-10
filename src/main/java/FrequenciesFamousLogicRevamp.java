import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
  we generally use hashmap to find out number of occurrences of a character in a given string
  and put char in key and count in value.
  Need to implement same but using the java 8 functional programming /lambdas
 */
public class FrequenciesFamousLogicRevamp {
    public static void main(String[] args) {
        System.out.println(getFrequencies("hello"));


    }

    private static Map<Character,Long> getFrequencies(String str){

           return str.chars().mapToObj(c->(char)c)
                   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


    }

    private static Map<Character,Long> getFrequenciesOfSplObj(String str){

        return str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


    }
}

 class Special{
    double salary;
    String dept;

 }
