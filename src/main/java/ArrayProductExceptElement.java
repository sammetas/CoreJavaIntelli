import java.util.Arrays;

/*
 input: a[] = {1,2,3,4,5};
 output: b[]={120,60,40,24} , you need to multiply all elements except the ith element to get ith position result
 */
public class ArrayProductExceptElement {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        long l =  Arrays.stream(a).reduce(1,(x,y)->x*y);
       // System.out.println(l);
        int res[] = new int[a.length];
        for(int i=0;i< res.length;i++){
            res[i] = (int)l/a[i];
        }
         for(int i=0;i<res.length;i++){
             System.out.println(res[i]);
         }


    }
}
