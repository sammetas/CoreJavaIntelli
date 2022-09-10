import java.util.Arrays;

public class SecondHighestInArray {

    public static void main(String[] args) {
       // int arr[]={12, 34, 10, 6, 40};
         int arr[]={44,66,99,77,33,22,55};
        Arrays.sort(arr);
        System.out.println("--->"+arr[arr.length-2]);
//or below logic
        int max=0;
        int secMax=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) {
                secMax=max;
                max = arr[i];

            }else    if(secMax<arr[i]){
                secMax=arr[i];
            }

        }
        System.out.println(secMax+"-"+max);
    }
}
