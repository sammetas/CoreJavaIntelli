import java.util.Arrays;
import java.util.stream.Stream;

// take an array and square all the elements
public class SortedSquareArray {
    public int[] squareArray(int a1[]){
        return Arrays.stream(a1).map(a->Math.abs(a)*Math.abs(a)).sorted().toArray();
    }
}
