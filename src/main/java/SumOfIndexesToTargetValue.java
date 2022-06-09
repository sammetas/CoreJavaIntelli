/*
two pointer sum
addup array to target
 */
public class SumOfIndexesToTargetValue {
    public static void main(String ar[]){

        int a[] =new int[]{2,7,11,15};
        int target=9;
        int start=0;
        int end=a.length-1;
         int sum=0;
        while(start<end){
            sum=a[start]+a[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                start++;
            }else {
         break;
            }

        }
        System.out.println("pos1:::"+a[start] +", pos2::"+ a[end]);
    }
}
