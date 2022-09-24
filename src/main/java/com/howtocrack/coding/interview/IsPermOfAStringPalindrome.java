package com.howtocrack.coding.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
  input: "amadm"
  If any of the permutation of the input string is a palindrome then return true ;
  input 2: "Tact coa"
  Output: True
  Input 3: "abcdef"
  Output: False
 */
public class IsPermOfAStringPalindrome {

    public  boolean isPermutationsIsPalindrome(String a){
        a = a.replaceAll(" ","").toLowerCase();

        Map<Character,Long> map = a.chars().mapToObj(o->(char)o).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        boolean isOne = false;
        boolean isAllTwo = false;
        for(Long i: map.values()) {
            if (!isOne && i == 1) {
                isOne = true;
            } else if (i == 2) {
                isAllTwo = true;
            } else {
                return false;
            }
        }
            return isOne && isAllTwo;
        }
    }


