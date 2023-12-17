/*
  given a {1,2,1,2,3,2,2,2,6,7,6}
  output: 6 : {1,2,1},{2,1,2} , {2,3,2},{3,2,2} ,{2,2,6} , {6,7,6}
  consider triplets {1,2,1} ,{2,1,2} ,{1,2,3} etc
  count the triplets such that at least one number should be repeated in a triplet ex. {1,2,1}
  ignore {1,2,3} and {2,2,2}

*/
public class Agoda1 {
    public static void main(String[] args) {

         int a[] = {1,2,1,2,3,2,2,2,6,7,6};
     //   int a[] = {1,2,2,2};

        int count=0;
         for(int i=0;i<a.length-2;i++){
             int j=i; int k=j+2;

              if(a[j] != a[k]){
                   if(a[j] == a[j+1] || a[k] ==  a[j+1]){
                       count++;
                   }

                 }else {
                    if(a[j] != a[j+1] || a[j+1] != a[k]){
                        count++;
                    }
              }


         }
        System.out.println(count);

    }
}
