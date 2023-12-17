import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayTargetSum {
    public static void main(String[] args) {
       // int a[] = {1, 1, 2, 3}, target = 4;
        int a[] = {1, 5,1, 2, 3,4,3}, target = 6;

        List<List<Integer>> result = new ArrayList<>();
        int right = a.length - 1;

        Arrays.sort(a);

        while (right >= 0) {
            int t = target;
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = right; i >= 0; i--) {
                t -= a[i];
                l.add(a[i]);
                if (t == 0) {
                    result.add(l);
                } else if (t < 0) {
                    l.remove((Object) a[i]);
                    t += a[i];
                }

            }

            right--;
        }
        System.out.println(result);

    }
}
