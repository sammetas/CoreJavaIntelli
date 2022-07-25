/*
    input: {1,2,3,7,5}
    Sum: 12
    Output: {2,4}
    Desc: find sub array such that its sum is equal to given sum.
 */
public class LongestSubArrayBySum {
    public static void main(String[] args) {

         int a[] = {1, 2, 3, 7,0,0, 5};
    //    int a[] = {1, 2, 3, 4,5,0,0,0,6,7,8,9, 10};
        int sum = 12;
        int left = 0;
        int right = 0;
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = 0;
            for(int j=i;j<a.length;j++){
                s+=a[j];
                if(s==sum){
                    if(j-i > right-left) {
                        left = i+1;
                        right = j+1;
                        //break;
                    }
                }else if (s>sum) break;
            }
        }
        System.out.println("i="+left +" , j="+right);
    }
}
