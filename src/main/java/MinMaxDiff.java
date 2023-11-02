
public class MinMaxDiff {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(18));
        int a[]={-1,12, 50,34, 10, 0, 40};

        int min=a[0];
        int max=a[0];

        for(int i=0;i<a.length;i++){

            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i] ){
                min=a[i];
            }
        }
        System.out.println(max+" and "+min);
    }
}
