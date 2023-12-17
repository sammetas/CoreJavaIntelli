import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.



Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 */
public class DistinctLists {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        List<Integer> listNum1 = Arrays.stream(nums1).boxed().toList();
        List<Integer> listNum2 = Arrays.stream(nums2).boxed().toList();

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        for (Integer i : listNum1) {
            if (!listNum2.contains(i))
                list1.add(i);
        }
        for (Integer i : listNum2) {
            if (!listNum1.contains(i))
                list2.add(i);
        }
        return result;

    }
}
