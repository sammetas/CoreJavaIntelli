public class SecondHighestInArray {

    public static void main(String[] args) {
        int arr[]={44,66,99,77,33,22,55};
      //  int arr[]={44,66,99,77,33,22,55};
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
        System.out.println(secMax);
    }
}
