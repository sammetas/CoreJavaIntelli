import java.util.Arrays;

/*
 input: a[] = {1,2,3,4,5};
 output: b[]={120,60,40,24} , you need to multiply all elements except the ith element to get ith position result
 */
public class ArrayProductExceptElement1 {
    public static void main(String[] args) {
        int[] a= {1,2,3,4};

        int sol[] = new int[a.length];
        sol[0] = 1;

        for(int i=1;i<a.length;i++){

            sol[i] = sol[i-1] * a[i-1];

        }
        for(int i=0;i<a.length;i++){
            System.out.println(sol[i]+",");
        }

    }
}
