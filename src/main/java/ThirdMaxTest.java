public class ThirdMaxTest {
    public static void main(String[] args) {

        int n[]= {51,32,33,24,5};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){

            if(n[i] >  max1){
                max1 = n[i];
            }else if( n[i] > max2){
                max2 = n[i];
            }else if( n[i] > max3){
                max3 = n[i];
            }
        }
        System.out.println(max1 +" " + max2 + " "+ max3);
    }
}
