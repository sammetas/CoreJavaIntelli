/*
  given a {1,2,1,2,3,2,2,2,6,7,6}
  consider trplets {1,2,1} ,{2,1,2} ,{1,2,3} etc
  count the trplets such that atleast one number should be repeated in a triplet ex. {1,2,1}
  ignore {1,2,3} and {2,2,2}

*/
public class Agoda1 {
    public static void main(String[] args) {

         //int a[] = {1,2,1,2,3,2,2,2,6,7,6};
        int a[] = {1,2,2,2};

        int count=0;
         for(int i=0;i<a.length-2;i++){
             int j=i+1;
             while(j<i+2){
                 /*if(a[i] == a[j] || a[j]==a[j+1] || a[i]==a[j+1]){

                     count++;
                 }*/

                 j++;

             }
         }
        System.out.println(count);

    }
}
