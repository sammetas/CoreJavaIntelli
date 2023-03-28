import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        //naive
        int a[] = {-1,0,1,2,-1,-4};
        int len = a.length;
        for(int i=0;i<len;i++)
            for(int j = i+1;j<a.length;j++)
                for(int k = j+1 ;k<len; k++)
                    if(a[i]+a[j]+a[k] == 0)
                        System.out.println("{"+a[i]+","+a[j]+","+a[k]+"}");

        //better a+b+c = 0 => a+b = -c
        System.out.println("better");
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ;i < len;i++){
            map.put(i,-a[i]);
        }
        for(int i=0;i<len;i++)
            for(int j = i+1;j<a.length;j++){
                if(a[i]+a[j] ==  map.get(i)){
                    System.out.println("{"+a[i]+","+a[j]+","+map.get(i)+"}");
                }
            }

    }
}
