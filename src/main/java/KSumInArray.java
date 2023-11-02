import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class KSumInArray {

    public int maxOperationsSort(int[] nums, int k) {
//1 2 3 4
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[right] + nums[left];
            if (sum <= k) {
                left++;
                right--;
                count++;
            } else {
                right--;
            }
        }

        return count;
    }

    public int maxOperations(int[] nums, int k) {
        int count = 0;

        int l = 0;
        HashMap<Integer, Integer> index = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k && !set.contains(j) && !set.contains(i)) {
                    count++;
                    set.add(j);
                    set.add(i);

                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        //  int[] n = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int[] n = {3, 1, 3, 4, 3};
        //int k = 2;
        int k = 6;
        System.out.println(new KSumInArray().maxOperations(n, k));
        System.out.println(new KSumInArray().maxOperationsSort(n, k));
    }

}
