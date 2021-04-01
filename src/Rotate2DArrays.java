/*
Rotate 2D array to 90 degrees clock wise direction.
//expected array
 */
public class Rotate2DArrays {

    public static void main(String[] args) {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        int b[][]= new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){

                b[i][j]=a[(2-j)%3][i];
            }
        }

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
           System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
