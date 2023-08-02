package day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4BiggestNumber {


    /*
        N Biggest Number

        Create a method that will find the n biggest number from an array of numbers.
        if n is 1 find thr 1st biggest number
        if n is 2 find thr 2st biggest number
        ...

        Ex:

        input:
                { 3, 1 ,5 ,2 ,5 ,7 ,23 ,6 ,2 ,1 ,7 }
                 n = 2
         output:
                7 -> 7 is the 2nd biggest

     */

    public static  int quick(int n , int...arr) {

        Arrays.sort(arr);
        return  arr[arr.length - n] ;
    }

    public static  int nBiggestNum(int n , int ...arr) {

        ArrayList<Integer> max = new ArrayList<>() ;
        max.add(0) ;

        for (int each: arr) {

            if (max.contains(each)){

                continue;
            }

            if (each > max.get(0)) {
                max.add(0 , each) ;
            }else {

                for (int i = 0; i < max.size(); i++) {

                    if (each > max.get(i)) {

                        max.add(i , each) ;

                        break;


                    }

                }
            }

        }

        return max.get(n - 1) ;


    }

    public static void main(String[] args) {

        System.out.println(nBiggestNum(1, 1 ,5 ,2 ,5 ,7 ,23 ,6 ,2 ,1 ,7 ));
        System.out.println(nBiggestNum(2, 1 ,5 ,2 ,5 ,7 ,23 ,6 ,2 ,1 ,7 ));
        System.out.println(nBiggestNum(3, 1 ,5 ,2 ,5 ,7 ,23 ,6 ,2 ,1 ,7 ));
        System.out.println(nBiggestNum(4, 1 ,5 ,2 ,5 ,7 ,23 ,6 ,2 ,1 ,7 ));
        System.out.println(nBiggestNum(5, 1 ,5 ,2 ,5 ,7 ,23 ,6 ,2 ,1 ,7 ));
    }

}
