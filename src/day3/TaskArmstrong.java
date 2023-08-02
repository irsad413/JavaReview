package day3;

public class TaskArmstrong {

    /*
    EX:
        input:153
        output: true

        the digits are 1 , 5 ,and 3

        the calculation would be :
        1^3 = 1 * 1 * 1 = 1
        5^3 = 5 * 5 * 5 = 125
        3^3 = 3 * 3 * 3  = 27

        1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an armstrong number

        Test data :
        153 --> true
        371 --> true
        9474 --> true
        9475 --> false
        123 --> false


     */

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));
        System.out.println(isArmstrong(9475));
        System.out.println(isArmstrong(123));
    }

    // 153
    public static  boolean isArmstrong(int n ) {

        String strN = String.valueOf(n) ; // "" +  n
        int power = strN.length() ;
        int sum = 0 ;

        for (int i = 0; i < strN.length(); i++) {
            int digit = Integer.parseInt("" + strN.charAt(i)) ;

            sum += Math.pow(digit , power)  ;
        }

        return n == sum ;
    }
}
