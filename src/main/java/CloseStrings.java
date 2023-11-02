import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occur
rence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 */
public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()){return false;}

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c: word1.toCharArray())
            map1.put(c,map1.getOrDefault(c,0)+1);
        for(char c: word2.toCharArray())
            map2.put(c,map2.getOrDefault(c,0)+1);

        return map1.keySet().equals(map2.keySet()) && new HashSet<>(map1.values()).equals(new HashSet<>(map2.values()));


    }

    public static void main(String[] args) {
        System.out.println(new CloseStrings().closeStrings("abc","bca"));
    }
}
