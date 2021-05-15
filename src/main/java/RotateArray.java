public class RotateArray {
    public static void main(String[] args) {

        int a[]={1,2,3};
        int k=2;
        for(int ii=0;ii<a.length;ii++){
            System.out.print(a[ii]+",");
        }
        System.out.println();
        while(k>0){

            int t=a[a.length-1];
            int i=a.length-1;
            while(i>0){
                a[i]=a[i-1];
                i--;
            }
            a[0]=t;
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
