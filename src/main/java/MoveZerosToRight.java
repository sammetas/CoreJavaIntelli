/*
move all zeros to right hand side
 */
public class MoveZerosToRight {
    public static void main(String[] args) {
        int ar[]={0,12,3,0,4,6,8,0,3,03,-1,0,47,0};
        int j=ar.length-1;
        for(int i=0;i<j;i++){

            if(ar[i]==0 ){

                  while(ar[j]==0){
                     // System.out.println(ar[j]);
                      j--;
                  }
                  int t=ar[i];
                  ar[i]=ar[j];
                  ar[j]=0;
            }
        }

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+",");
        }
    }
}
