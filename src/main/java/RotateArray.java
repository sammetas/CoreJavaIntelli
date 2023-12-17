import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int k=4;
        //OUtput: 3,4,2,1 when k=2
        if(k>a.length)k%=a.length;
        for(int ii=0;ii<a.length;ii++){
            System.out.print(a[ii]+",");
        }
        System.out.println();
        int n = a.length -1;
        while(k>0){
          int i =0;
            while(i < n){
                int t= a[i];
                a[i]= a[i + 1];
                a[i + 1] = t;
                i++;
            }


        k--;

        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
}
