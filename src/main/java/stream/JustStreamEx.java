package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JustStreamEx {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100);
       int sum = numbers.stream().filter(a->a%2==0)
                .map(a->a*2)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
        IntStream integerStream = "abcA".chars();
        integerStream.forEach(System.out::println);
        Function<String,String> toCap = a->a.toUpperCase();
        Stream.of("abc","xyz","pqr").map(toCap).collect(Collectors.toList()).forEach(System.out::println);
        // sum of even numbers

        long a1 = Stream.of(1,2,3,4,5,6).filter(a->a%2==0).reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println(a1);
    }
}
