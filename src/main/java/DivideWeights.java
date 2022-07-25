import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class DivideWeights {
    public static void main(String[] args) {
        int arr[] = {2,5,7,9,6,1,8,2} ; //output expected: {2,7,2,8,2} {9,6,5} each set sums to 20 which is half of input array sum.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int currsum =0;
        int maxSum = Integer.MIN_VALUE;
        int sum = Arrays.stream(arr).sum();
        int eqSum =sum/2;
        for(int i=0;i<arr.length;i++){
            currsum = currsum + arr[i];
            for(int j=0;j<arr.length;j++){
                if(currsum+arr[j] <= eqSum && i!=j){
                    currsum+=arr[j];
                    maxSum = Math.max(currsum,maxSum);
                    list1.add(arr[j]);
                }
            }currsum=0;
            System.out.println("list::"+list1);list1=new ArrayList<>();
        }
        System.out.println(maxSum);




    }
}
