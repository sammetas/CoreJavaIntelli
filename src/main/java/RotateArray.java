public class RotateArray {
    public static void main(String[] args) {

        int a[]={1,2,3,4};
        int k=2;
        if(k>a.length)k%=a.length;
        for(int ii=0;ii<a.length;ii++){
            System.out.print(a[ii]+",");
        }
        System.out.println();
        while(k>0){
         int i=a.length-1;
            while(i>0){
                int t= a[i];
                a[i]=a[i-1];
                a[i-1] = t;
                i--;
            }
            for(int ii=0;ii<a.length;ii++){
                System.out.print(a[ii]+",");
            }
            System.out.println();

        k--;
            for(int ii=0;ii<a.length;ii++){
                System.out.print(a[ii]+",");
            }
            System.out.println();
        }

       /* for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();*/
    }
}
