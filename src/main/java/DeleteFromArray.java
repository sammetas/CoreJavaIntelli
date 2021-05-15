import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DeleteFromArray {
    public static void main(String[] args) {
        int a[]={12,2,3,4,5,6};

        int toBeRemoved=6; //if its a value not index

        int newArr[]=new int[a.length-1] ;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(toBeRemoved==a[i]) continue;
            newArr[j++]=a[i];
        }

 for (int i=0;i<newArr.length;i++){
     System.out.print(newArr[i]+",");
 }



        //java 8 code
        System.out.println("----java 8--------");
int index=3;
        int aa[]={1,2,3,4,5,6,9};

         //List<Integer> list=  Arrays.stream(a).collect(Collectors.toList());
        int b[]=IntStream.range(0,aa.length).filter(ii->ii!=index).map(ii->aa[ii]).toArray();

for(int ii=0;ii<b.length;ii++){
    System.out.println(b[ii]);
}

    }
}
