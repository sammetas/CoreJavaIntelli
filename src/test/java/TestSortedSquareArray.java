import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSortedSquareArray {
    @Test
    public void testSort(){
        Set<String> s = new HashSet<>();
         s.add("abc");s.add("iff");

        int n []={1,7,3,6,2};
        int[] res = new SortedSquareArray().squareArray(n);
        for(int a: res){
            System.out.println(a);
        }
        Assert.assertEquals(Arrays.stream(res).max().getAsInt(),49);
    }
}
