import java.util.Arrays;
import java.util.List;

/*
  This program demonstrates how to find out the lonely Integer. Means which is not duplicate the list.
  Logic: We are comparing that if the index of an element and last index of an element were same means that is Lonely.
  If there are duplicates the index and lastIndex will be different and skipped.
 */
public class FindTheLonelyInteger {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,3,2,3,5);
        for(int i=0;i<list.size();i++){

            if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i))){
                System.out.println("The Lonely Integer(s)::"+list.get(i));
            }
        }



    }
}
