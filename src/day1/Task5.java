package day1;

public class Task5 {


    /*

    Frequency of Characters

    Given a String that has multiple of the same characters determine the frequency of each character . Output a concatenated String that shows the character and the frequency of it

    input :
    aaaabccdd

    output :
    a4b1c3d2
     */

    public static void main(String[] args) {


        String str = "aaaabcccdd" ;

        String result = ""  ;

        while (!str.isEmpty()) {
            int origLength = str.length() ;// 10
            String currentChar = str.substring(0 , 1) ;
            str = str.replace(currentChar  , "") ;
            result += currentChar + ( origLength - str.length()) ;

        }

        System.out.println(result);


    }
}
