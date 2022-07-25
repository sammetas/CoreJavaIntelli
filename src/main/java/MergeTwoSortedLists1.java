public class MergeTwoSortedLists1 {
    public static void main(String[] args) {
      //  int[] a1  = {3,5,6,8};//{6,3,5,8};
        int[] a1  =  {6,3,5,8};
        int[] a2  =  {5,3,1,4,5,81};
        int l1= a1.length-1;
        int l2 = a2.length-1;
        int res[] = new int[l1+l2];

        int i=0;int j=0;int k=0;


        while (k<(l1+l2)) {
            if (l1 < l2) {
                while (i < l1 && j < l2) {
                    if (a1[i] < a2[j])  {
                        res[k++] = a1[i++];
                    } else {
                        res[k++] = a2[j++];
                    }
                }
            }
        }
                for(;k< res.length;k++){
                    res[k]=a2[j++];
                }

                for(int kk=0;kk< res.length;kk++)
                 System.out.println(res[kk]);


    }
}
