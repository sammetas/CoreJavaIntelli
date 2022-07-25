import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxSubArrayProduct {
    public static void main(String[] args) {
        int a[] = new int []{-2,3,-2,-4}; //ex o/t =6
        //int a[] = new int []{-2,0,-2}; //ex o/t = 0

        int temp1 =  a[0];
        int temp2 = a[0];
        int sol = a[0];

        for(int i=1; i < a.length;i++){
            if(Integer.signum(a[i])==-1){
                temp1 = min(temp1*a[i],a[i]);
                sol = max(temp1,sol);
            }else{
                temp1 = max(temp1*a[i],a[i]);
                sol = max(temp1,sol);
            }
        }
        System.out.println("MAX Product::"+sol);

    }
}
