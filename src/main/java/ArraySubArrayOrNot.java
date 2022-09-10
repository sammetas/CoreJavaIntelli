/*
Need to find out array1 is subset of Array2 or vise versa.
 */
public class ArraySubArrayOrNot {
    public static void main(String[] args) {

        int a[]=new int[]{1,33,2,5,3,6,4};
        int subA[]=new int[] {2,5,3,6};
        int[] subB=new int[]{2,5,3};
int n=a.length;
int m=subB.length;
        int i=0;int j=0;
        boolean b= false;
        while(i<n && j<m){
            if(a[i]==subB[j]){
                i++;
                j++;
                if(j==m) b= true;
            }else{
                i=i-j+1;
                j=0;

            }
        }
        System.out.println(b);
        if(b){
        //    System.out.println("The positions ("+(i+1)+","+(j+1)+")");
        }




    }
}
