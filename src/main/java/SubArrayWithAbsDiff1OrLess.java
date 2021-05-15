//return length of max length subarray whose abs diff of any of them is <=1

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubArrayWithAbsDiff1OrLess {
    public static void main(String[] args) {

         int a[] = {1,1,2,2,4,4,5,5,5};
       List<Integer> list= Arrays.asList(new Integer[]{1,1,2,2,4,4,5,5,5});
        //  List<Integer> list= Arrays.asList(new Integer[]{4,6,5,3,3,1});
      //  List<Integer> list= Arrays.asList(new Integer[]{4,2,3,4,4,9,98,98,3,3,3,4,2,98,1,98,98,1,1,4,98,2,98,3,9,9,3,1,4,1,98,9,9,2,9,4,2,2,9,98,4,98,1,3,4,9,1,98,98,4,2,3,98,98,1,99,9,98,98,3,98,98,4,98,2,98,4,2,1,1,9,2,4});
        Collections.sort(list); //5,5,5,4,4,2,2,1,1 becomes 1,3,3,4,5,6

         int result=pickingNumber(list);
        System.out.println(result);

    }

    private static int pickingNumber(List<Integer> list) {

      int maxCount=0;
      int count=0;
      int i=0;

      for(int j=1;j<list.size();j++){

          if(Math.abs(list.get(i)-list.get(j))<=1){
              if(count==0){
                  count=2;

              }else{
                  count++;

              }
              if(count>maxCount){
                  maxCount=count;

              }
          }else{


              i=j;

              count=0;
          }
      }

        return  maxCount;
    }
}
