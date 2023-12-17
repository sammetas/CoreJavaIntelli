import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Kattis is taking one of her kittens out on several hiking trips, and they need to pack their backpacks.
They have a number of items (tents, cooking equipment, food, clothing, etc.),
and need to split the weight between them as evenly as possible.
In case the weight can’t be split evenly, Kattis will carry the extra weight. Can you you help them split the
 items between them for each trip?


Input
Input contains of up to  hiking trips. Each trip is given as a line in the input. The line starts with ,
 the number of items they need to split. Then follows the weight of each item.
 The weights are all in the range of [100,600]  grams. End of input is indicated by a line containing a single .

Output
For each trip, output the weights of the two backpacks. Output the weight of the backpack Kattis will carry first.

Sample Input 1
8 529 382 130 462 223 167 235 529
Sample Input 2
12 528 129 376 504 543 363 213 138 206 440 504 418

Sample output 1
1344 1313
Sample output 2
2181 2181
 */
public class AgileSearch3 {

    public static int[] getAlmostEqualWeights(List<Integer> wts){

        wts.sort(Integer::compareTo);
        System.out.println(wts);


        int sum1 = 0 ;
        int sum2  = 0;
        int i=0; int j = wts.size() -1;
        while (i <= j) {
            if (sum1 <= sum2) {
                sum1 += wts.get(j);

            } else  {
                sum2 += wts.get(j);
            }
            j--;
        }
        System.out.println(sum1 +" and ="+sum2);
        return new int[]{sum1,sum2};
    }
    public static void main(String[] args) {
   //   List<Integer> list = Arrays.asList( 529 ,382, 130, 462, 223, 167, 235, 529);
     List<Integer> list = Arrays.asList(528 ,129, 376, 504, 543, 363, 213, 138, 206 ,440 ,504, 418);
    int results[] = getAlmostEqualWeights(list);
        list.sort(Integer::compareTo);
        int sums = list.stream().reduce(0,Integer::sum);
      //  System.out.println(sums/2);
        sums =  sums/2;
      //  System.out.println(list );
        List<Integer> sum1L = new ArrayList<>();
        List<Integer> sum2L = new ArrayList<>();
        int sum1=0,sum2=0;
        int i=0;
        while (sum1 <= sums && i<list.size()){
            if(sum1+list.get(i) <= sums){
            sum1 = sum1 + list.get(i);

            }
            i++;
        }
        System.out.println(sum1 +" and "+sums);
    }
}
