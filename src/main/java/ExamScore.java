/*
  Ans[] is answered by student but actually needed marks per subject is needed[]. we have to
  adjust q value to get maxSubjects to pass to ans[]
 */
public class ExamScore {
    public static void main(String[] args) {

        int n=4;
        int ans[]={24,27,0,20};
        int needed[]={51,42,100,35};
        int q=100;
        int res=0;
        int i=0;
        while (q>0 && i<n){

            if(ans[i]<needed[i] && q>(needed[i]-ans[i])){
                q=q-(needed[i]-ans[i]);
                res++;
            }
            i++;
        }
        System.out.println(res);

    }
}
