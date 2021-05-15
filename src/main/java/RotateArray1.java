public class RotateArray1 {
    public static void main(String[] args) {

        int a[]={1,2,3}; // -->3,1,2 --> 2,3,1
        int dup[]=new int[a.length];
        int queries[]={0,1,2};
        int result[]=new int[queries.length];
        int k=2;


         int n=a.length;

        for(int i=0;i<a.length;i++){

            dup[(i+k)%n]  =   a[i];
        }
        System.out.println("dup array::");
        for (int j=0;j<dup.length;j++){
            System.out.print(dup[j]+",");
        }
        System.out.println();
        for(int j=0;j<queries.length;j++){
            result[j]=dup[queries[j]];
        }

        for (int j=0;j<result.length;j++){
            System.out.print(result[j]+",");
        }

        System.out.println();
    }
}
