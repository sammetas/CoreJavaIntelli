/*
https://www.baeldung.com/java-maximum-subarray#:~:text=The%20maximum%20subarray%20problem%20is,sum%20in%20any%20given%20array.&text=In%20this%20tutorial%2C%20we'll,n)%20time%20and%20space%20complexity.
https://leetcode.com/problems/maximum-subarray/submissions/
 */
public class MaxSubArraySumAndPos {
    public static void main(String[] args) {
        int a[] = new int []{-2,1,-3,4,-1,2,1,-5,4};
int start=0;int end=0;
        int maxSoFar=a[0]; int maxEndHere=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] > maxEndHere + a[i]){
                start=i;
                maxEndHere = a[i];
            }else{
                maxEndHere = maxEndHere+a[i];
                if(maxSoFar<maxEndHere){
                    maxSoFar=maxEndHere;
                    end=i;
                }
            }
        }
        System.out.println("maxSoFar::"+maxSoFar);

    }
}
