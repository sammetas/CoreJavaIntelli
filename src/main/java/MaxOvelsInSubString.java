public class MaxOvelsInSubString {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
        System.out.println(maxVowelsV1("abciiidef",3));
    }

    private static int maxVowelsV1(String s, int k) {
        int count =0;
        int j = k;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' && j<k) {
                count++;
                j++;
            }else {
                if(j>=k){
                    j = 0;
                    max = Math.max(count,max);
                }else {
                    j++;
                }
            }
        }
        return max;
    }

    public static int maxVowels(String s,int k){

        int i=0;

        int maxOvels = Integer.MIN_VALUE;
        while (i < s.length()-k){
            int j = 0;
             int count =0;
            while  (j < k){
                char c = s.charAt(i+j);
             if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                 count++;
             }
             j++;
            }
            maxOvels = Math.max(maxOvels,count);
            i++;
        }
        return maxOvels;

    }
}
