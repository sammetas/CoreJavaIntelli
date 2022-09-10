package com.howtocrack.coding.interview;

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
   input:small : abbc and big: cbabadcbbabbcbabaabccbabc
   We need to find that index of  any combination (any order of characters) of small string in big string.
   Need to return start   index of big string from where the permutation of small is started.



 */
public class SearchAStringInAnotherBigString {
    public static void main(String[] args) {
        String small = "abbc";
        String big = "cbabadcbbabbcbabaabccbabccabbc";
        //String big = "abcdefghidlalsksjcbab";

        for(int i=0; i<big.length(); i++){

            if(isStringPresent(small,big.substring(i,i+4))){
                System.out.println("Start From::"+ (i+1));
                i = i + 4;
            }

        }
    }

    private static boolean isStringPresent(String small, String substring) {
        Map<Character,Long> mapBig =
                                   substring.chars().mapToObj(c->(char)c)
                                           .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character,Long> mapSmall =
                small.chars().mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       // System.out.println(mapBig);
           for(int i=0;i<small.length();i++){
               if(mapBig.containsKey(small.charAt(i))){
                   if(! (mapBig.get(small.charAt(i)) == mapSmall.get(small.charAt(i)))){
                       return false;
                   }
               }else {
                   return false;
               }
           }
           return true;

    }
}
