package day2;

public class Task1MethodMinTasks {

    // Create methods for each of the following mini tasks:

    public static void main(String[] args) {

        System.out.println(cube(2));
        System.out.println(cube(4));
        System.out.println(vowels("abcde"));
        System.out.println(vowels("zwxbm"));
        System.out.println(nextHour("1:15"));
        System.out.println(nextHour("11:57"));

        System.out.println(capitalize("java is cool. i LOVE to program. i want to KEEP LEARNING"));



    }

    public static int cube(int n ) {

        return  n * n * n ;
    }


    public static int vowels (String str) {

        int count = 0 ;

        for (char eachChar : str.toCharArray()) {

            if (eachChar == 'a' || eachChar == 'e' || eachChar == 'i' || eachChar == 'o' || eachChar == 'u') {

                count++ ;
            }
        }

        return  count ;
    }


    public static  int nextHour (String time) {

        int minutes = Integer.parseInt(time.substring(time.indexOf(":") + 1)) ;
        return  60 - minutes ;

    }

    public static  String capitalize (String str) {

        String [] sentence = str.split("\\. ") ;
        String fixed = "" ;

        for (String each : sentence) {

            fixed += each.substring(0 , 1).toUpperCase() + each.substring(1).toLowerCase()  +  ". ";
        }

        return  fixed.trim() ;
    }



}
