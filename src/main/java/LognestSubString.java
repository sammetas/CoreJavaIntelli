import java.util.HashSet;

class LognestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pqrstuvwxyzoasdaababcdefghijkl"));
    }
    public static int lengthOfLongestSubstring(String s) {
        
        int max = Integer.MIN_VALUE;
        int maxSofar = 0;
        for(int i=0; i< s.length();i++){
            maxSofar = 0;
            HashSet set = new HashSet();
            for(int j=i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    maxSofar++;
                }else {
                    max = Math.max(max,maxSofar);break;
                }
                
            }
            max = Math.max(max,maxSofar);


        }
        return  max;
        
        
    }
}