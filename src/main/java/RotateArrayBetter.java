public class RotateArrayBetter {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int  k=3;
        k=(k>a.length)?k%=a.length:k;
        int[] res = new int [a.length];

        for(int i=0;i<k;i++){
            res[i] = a[a.length-k+i];
        }int ii =0;
        for(int j=k;j<a.length;j++){
            res[j] = a[ii++];
        }

        for(int i=0;i<a.length;i++){
            System.out.print(res[i]+",");
        }
    }
}
