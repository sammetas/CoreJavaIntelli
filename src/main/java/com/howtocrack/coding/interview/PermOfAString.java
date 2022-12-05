package com.howtocrack.coding.interview;

public class PermOfAString {
    public static void main(String[] args) {
        String str = "abc";
        permutations("",str);
    }

    private static void permutations(String s, String str) {

        if(str.length() == 0){
            System.out.print(s + " ,");
        }
        for(int i=0;i<str.length();i++){
            String rem =  str.substring(0,i) + str.substring(i+1) ;
            permutations(s+str.charAt(i),rem);
        }

    }
}
