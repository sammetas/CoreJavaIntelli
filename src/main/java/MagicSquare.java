import java.util.Scanner;
/*
Character Square
Given a string and size of the square, output the character square using characters from the string

Note that the direction is clockwise starting from the bottom left corner.

For string 12345678 and height 3, the pattern is

3 4 5
2   6
1 8 7
For string xy and height 3, the pattern is
x y x
y   y
x y x
x x
x x
 */
  class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int noOfCases= scanner.nextInt();


       int count=0;
       while(count<noOfCases) {
           int len=scanner.nextInt();
           int rows=scanner.nextInt();
           String str=scanner.next().trim();
           int k=0;
           char arr[][] = new char[rows][rows];
           for (int i = rows - 1; i >= 0; i--) {

               arr[i][0] = str.charAt(k % (len));
               k++;

           }

           for (int i = 1; i < rows; i++) {
               arr[0][i] = str.charAt(k % (len));
               k++;
           }

           for (int i = 1; i < rows; i++) {
               arr[i][rows - 1] = str.charAt(k % (len));
               k++;
           }

           for (int i = rows - 2; i > 0; i--) {
               arr[rows - 1][i] = str.charAt(k % (len));
               k++;
           }

           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < rows; j++) {
                   System.out.print(arr[i][j]+" ");
               }
               System.out.println();
           }
           count++;
       }




    }
}
