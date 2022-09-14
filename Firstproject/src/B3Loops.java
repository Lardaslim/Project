import java.util.Date;
import java.util.Map;

public class B3Loops {

    public static void main(String[] args) throws Exception {
        getDigitalRoot(12345);
    }

    /**
     * Returns the 'Fizz','Buzz' or an original number as String using the following
     * rules:
     * 1) return original number as String
     * 2) but if number multiples of three return 'Fizz'
     * 3) for the multiples of five return 'Buzz'
     * 4) for numbers which are multiples of both three and five return 'FizzBuzz'
     *
     * @param {number} num
     * @return {any}
     *
     * @example
     *          2 => '2'
     *          3 => 'Fizz'
     *          5 => 'Buzz'
     *          4 => '4'
     *          15 => 'FizzBuzz'
     *          20 => 'Buzz'
     *          21 => 'Fizz'
     *
     */
    public static String getFizzBuzz(Integer num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        } else if (num % 3 != 0 && num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 != 0 && num % 5 != 0) {
            System.out.println(num);
        }
        return null;
    } // getFizzBuzz(15);

    /**
     * Returns the factorial of the specified integer n.
     *
     * @param {number} n
     * @return {number}
     *
     * @example:
     *           1 => 1
     *           5 => 120
     *           10 => 3628800
     */
    public static Integer getFactorial(Integer num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {

            n *= i;
            if (i == num) {
                System.out.println(n);
            }
        }
        return num;
        // getFactorial(5);
    }

    /**
     * Returns the sum of integer numbers between n1 and n2 (inclusive).
     *
     * @param {number} n1
     * @param {number} n2
     * @return {number}
     *
     * @example:
     *           1,2 => 3 ( = 1+2 )
     *           5,10 => 45 ( = 5+6+7+8+9+10 )
     *           -1,1 => 0 ( = -1 + 0 + 1 )
     */
    public static Integer getSumBetweenNumbers(Integer num1, Integer num2) {
        int n3 = 0;
        for (int i = num1; i <= num2; i++) {
            n3 += i;
            if (i == num2) {
                System.out.print(n3 + " ( = ");
                for (int i2 = num1; i2 <= num2; i2++) {
                    System.out.print(i2);
                    if (i2 < num2) {
                        if (num1 < 0) {
                            System.out.print(" + ");
                        } else {
                            System.out.print("+");
                        }
                    } else {
                        System.out.print(" )");
                    }
                }
            }
        }
        return 0;
        // getSumBetweenNumbers(5, 10);
    }

    /**
     * Returns true, if a triangle can be built with the specified sides a,b,c and
     * false in any other ways.
     *
     * @param {number} a
     * @param {number} b
     * @param {number} c
     * @return {bool}
     *
     * @example:
     *           1,2,3 => false
     *           3,4,5 => true
     *           10,1,1 => false
     *           10,10,10 => true
     */
    public static Boolean isTriangle(Integer a, Integer b, Integer c) {
        System.out.println(a < (b + c) && b < (a + c) && c < (a + b) ? "true" : "false");
        return false;
        // isTriangle(1, 2, 3);

    }

    /**
     * Returns true, if two specified axis-aligned rectangles overlap, otherwise
     * false.
     * Each rectangle representing by Map<String, Integer>
     * {
     * top: 5,
     * left: 5,
     * width: 20,
     * height: 10
     * }
     * 
     * (5;5)
     * -------------
     * | |
     * | | height = 10
     * -------------
     * width=20
     * 
     * NOTE: Please use canvas coordinate space
     * (https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API/Tutorial/Drawing_shapes#The_grid),
     * it differs from Cartesian coordinate system.
     * 
     * @param {Map<String, Integer>} rect1
     * @param {Map<String, Integer>} rect2
     * @return {bool}
     *
     * @example:
     *           { top : 0, left: 0, width: 10, height: 10 },
     *           { top: 5, left: 5, width: 20, height: 20 } => true
     * 
     *           { top: 0, left: 0, width: 10, height: 10 },
     *           { top:20, left:20, width: 20, height: 20 } => false
     * 
     */
    public static Boolean doRectanglesOverlap(Map<String, Integer> rect1, Map<String, Integer> rect2) {
        return true;
    }

    /**
     * Returns true, if point lies inside the circle, otherwise false.
     * Circle is:
     * Center Map<String, Double>: {
     * x: 5,
     * y: 5
     * },
     * Radius Integer: 20
     * Point is Map<String, Double>
     * {
     * x: 5,
     * y: 5
     * }
     * 
     * @param {Map<String, Double>} center
     * @param {Integer}    raduis
     * @param {Map<String, Double>} point
     * @return {bool}
     *
     * @example:
     *           center: { x:0, y:0 }, radius: 10, point: { x:0, y:0 } => true
     *           center: { x:0, y:0 }, radius:10, point: { x:10, y:10 } => false
     * 
     */
    public static Boolean isInsideCircle(Map<String, Double> center, Integer radius, Map<String, Double> point) {
        return false;
    }

    /**
     * Returns the first non repeated char in the specified strings otherwise
     * returns null.
     *
     * @param {string} str
     * @return {string}
     *
     * @example:
     *           'The quick brown fox jumps over the lazy dog' => 'T'
     *           'abracadabra' => 'c'
     *           'entente' => null
     */
    public static String findFirstSingleChar(String str) {
        return null;
    }

    /**
     * Returns the string representation of math interval, specified by two points
     * and include / exclude flags.
     * See the details: https://en.wikipedia.org/wiki/Interval_(mathematics)
     *
     * Please take attention, that the smaller number should be the first in the
     * notation
     *
     * @param {number} a
     * @param {number} b
     * @param {bool}   isStartIncluded
     * @param {bool}   isEndIncluded
     * @return {string}
     *
     * @example
     *          0, 1, true, true => '[0, 1]'
     *          0, 1, true, false => '[0, 1)'
     *          0, 1, false, true => '(0, 1]'
     *          0, 1, false, false => '(0, 1)'
     *          Smaller number has to be first :
     *          5, 3, true, true => '[3, 5]'
     *
     */
    public static String getIntervalString(Integer a, Integer b, Boolean isStartIncluded, Boolean isEndIncluded) {
        return "";
    }

    /**
     * Reverse the specified string (put all chars in reverse order)
     *
     * @param {string} str
     * @return {string}
     *
     * @example:
     *           'The quick brown fox jumps over the lazy dog' => 'god yzal eht revo
     *           spmuj xof nworb kciuq ehT'
     *           'abracadabra' => 'arbadacarba'
     *           'rotator' => 'rotator'
     *           'noon' => 'noon'
     */
    public static String reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        return "";
        // reverseString("rotator");
    }

    /**
     * Reverse the specified integer number (put all digits in reverse order)
     *
     * @param {number} num
     * @return {number}
     *
     * @example:
     *           12345 => 54321
     *           1111 => 1111
     *           87354 => 45378
     *           34143 => 34143
     */
    public static Integer reverseInteger(Integer num) {
        for (int i = (num.toString()).length() - 1; i >= 0; i--) {
            System.out.print((num.toString()).charAt(i));
        }
        return 0;
        // reverseInteger(12345);
    }

    /**
     * Returns the digital root of integer:
     * step1 : find sum of all digits
     * step2 : if sum > 9 then goto step1 otherwise return the sum
     *
     * @param {number} n
     * @return {number}
     *
     * @example:
     *           12345 ( 1+2+3+4+5 = 15, 1+5 = 6) => 6
     *           23456 ( 2+3+4+5+6 = 20, 2+0 = 2) => 2
     *           10000 ( 1+0+0+0+0 = 1 ) => 1
     *           165536 (1+6+5+5+3+6 = 26, 2+6 = 8) => 8
     */
    public static Integer getDigitalRoot(Integer num) {
        return 0;
    }

    /**
     * Returns true if the specified string has the balanced brackets and false
     * otherwise.
     * Balanced means that is, whether it consists entirely of pairs of
     * opening/closing brackets
     * (in that order), none of which mis-nest.
     * Brackets include [],(),{},<>
     *
     * @param {string} str
     * @return {boolean}
     *
     * @example:
     *           '' => true
     *           '[]' => true
     *           '{}' => true
     *           '() => true
     *           '[[]' => false
     *           '][' => false
     *           '[[][][[]]]' => true
     *           '[[][]][' => false
     *           '{)' = false
     *           '{[(<{[]}>)]}' = true
     */
    public static Boolean isBracketsBalanced(String str) {/////// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        return false;
    }

    /**
     * Returns the human readable string of time period specified by the start and
     * end time.
     * The result string should be constrcuted using the folliwing rules:
     *
     * ---------------------------------------------------------------------
     * Difference | Result
     * ---------------------------------------------------------------------
     * 0 to 45 seconds | a few seconds ago
     * 45 to 90 seconds | a minute ago
     * 90 seconds to 45 minutes | 2 minutes ago ... 45 minutes ago
     * 45 to 90 minutes | an hour
     * ago///////////////////////////////////////////////////////
     * 90 minutes to 22 hours | 2 hours ago ... 22 hours ago
     * 22 to 36 hours | a day ago////////////////////////////////////////////////
     * 36 hours to 25 days | 2 days ago ... 25 days ago
     * 25 to 45 days | a month ago
     * 45 to 345 days | 2 months ago ... 11 months ago
     * 345 to 545 days (1.5 years) | a year ago
     * 546 days+ | 2 years ago ... 20 years ago
     * ---------------------------------------------------------------------
     *
     * @param {DateTime} startDate
     * @param {DateTime} endDate
     * @return {string}
     *
     * @example
     *          DateTime('2000-01-01 01:00:00'), DateTime('2000-01-01 01:00:01') =>
     *          'a few seconds ago'
     *          DateTime('2000-01-01 01:00:00'), DateTime('2000-01-01 01:00:05') =>
     *          '5 minutes ago'
     *          DateTime('2000-01-01 01:00:00'), DateTime('2000-01-02 03:00:05') =>
     *          'a day ago'
     *          DateTime('2000-01-01 01:00:00'), DateTime('2015-01-02 03:00:05') =>
     *          '15 years ago'
     *
     */
    public static String timespanToHumanString(Date startDate, Date endDate) {
        return "";
    }
}
