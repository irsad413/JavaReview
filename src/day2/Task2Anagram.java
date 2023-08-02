package day2;

import java.util.Arrays;

public class Task2Anagram {

    /*

    Anagram

    Create a method that will determine if two Strings are anagrams of each other. Am anagram is when the character of the words can be reordered to get a different word. Return boolean , ture for anagram & false for not anagram

    Ex:
    listen
    silent

    The letters of the two words are the same , so they are anagram
     */

    public static void main(String[] args) {

        String s = "listen" ;
        String s2 = "silent" ;

        System.out.println(isAnagram(s , s2) );
    }


    public  static  boolean isAnagram (String one , String two) {

         if (one.length() != two.length()) {

             return  false ;
         }

         char[] oneArr = one.toCharArray() ;
         char[] twoArr = two.toCharArray() ;

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);
        System.out.println(Arrays.toString(oneArr));
        System.out.println(Arrays.toString(twoArr));

        return  Arrays.equals(oneArr , twoArr) ;


    }
}
