import java.util.ArrayList;
import java.util.List;

public class MoveZerosInPlace {
    public static void main(String[] args) {
        List<Integer> number1 = List.of(1,0,3,0,0,5,3,6,0,7,8,9);
        List<Integer> number2 = List.of(0,0,1,0,0,1,0,0,1,0,1,0);
        List<Integer> number3 = List.of(0,0,0,0,0,5,3,61,10,71,81,9);
        List<List<Integer>> numbers = List.of(number3,number1,number2);
        System.out.println(moveZerosInPlace(numbers));

    }

    private static List<List<Integer>> moveZerosInPlace(List<List<Integer>> numbers) {
        List<List<Integer>> resultList = new ArrayList<>();
        for(List<Integer> list: numbers){

        }
        return null;
    }

}
