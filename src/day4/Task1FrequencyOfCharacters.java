package day4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1FrequencyOfCharacters {

    /*


    Frequency of Characters

    Given a String determine the frequency of each character. Output each character and the count of each character

    input:
        java
    output:
        j - 1
        a - 2
        v - 1

     */

    public static void main(String[] args) {

        String str = "java" ;

        Map<Character , Integer> map = new LinkedHashMap<>() ; // value is the counter

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i) ;

            if (map.containsKey(eachLetter)) {

                map.put(eachLetter , map.get(eachLetter) + 1) ;
            }else {

                map.put(eachLetter , 1) ; // for the first time , for each character

            }

        }

        System.out.println(map);

        for (char key : map.keySet()) {

            System.out.println( key  + " - " + map.get(key));
        }


    }


}
