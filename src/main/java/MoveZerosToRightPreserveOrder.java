/*
move all zeros to right hand side but order should not change
 */
public class MoveZerosToRightPreserveOrder {
    public static void main(String[] args) {
        int ar[]={0,12,3,0,4,6,8,0,3,03,-1,0,47,0};
        int t[]=new int[ar.length];
        int j=0;
        int i;
        for(i=0;i<ar.length;i++){

            if(ar[i]!=0 ){
            t[j]=ar[i];
            j++;
            }
        }
        if(j<i){
        t[j++]=0;
        }

        for(int ii=0;ii<ar.length;ii++){
            System.out.print(t[ii]+",");
        }
    }
}
