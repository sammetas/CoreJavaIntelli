import java.util.Arrays;
import java.util.Scanner;

public class DeleteFromArrayNoExtraSpaceArr {
    public static void main(String[] args) {

        int a[]={5,4,3,6,7,3,2};
        int positionToBeDeleted=-1;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Element to be delete::");
        positionToBeDeleted=scanner.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i]==positionToBeDeleted){
               /* for(int j=i;j<a.length-1;j++)
                    a[j]=a[j+1];*/
                System.arraycopy(a,i+1,a,i,a.length-1);
            }
        }
        /*for(int i=0;i<b.length;i++){
            System.out.println(b[i]+",");
        }*/
            
      int[]  b= new int[a.length-1];
        System.arraycopy(a,0,b,0,a.length-1);

        /*System.out.println("length"+b.length);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+",");
        }*/

    }
}
