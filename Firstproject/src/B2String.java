//import java.util.List;
//import java.util.Scanner;
public class B2String {
    public static void main(String[] args) {
        getCardId("5peak");

    }

    /**
     * Returns the result of concatenation of two strings.
     *
     * @param {string} value1
     * @param {string} value2
     * @return {string}
     *
     * @example
     *          'aa', 'bb' => 'aabb'
     *          'aa','' => 'aa'
     *          '', 'bb' => 'bb'
     */
    public static void concatenateStrings(String value1, String value2) {
        System.out.println(value1.concat(value2));
        // concatenateStrings("aa", "bb");
    }

    /**
     * Returns the length of given string.
     *
     * @param {string} value
     * @return {number}
     *
     * @example
     *          'aaaaa' => 5
     *          'b' => 1
     *          '' => 0
     */
    public static void getStringLength(String value) {
        System.out.println(value.length());
        // getStringLength("aaaaa");
    }

    /**
     * Returns the result of string template and given parameters firstName and
     * lastName.
     * Please do not use concatenation, use template string :
     * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/template_strings
     *
     * @param {string} firstName
     * @param {string} lastName
     * @return {string}
     *
     * @example
     *          'John','Doe' => 'Hello, John Doe!'
     *          'Chuck','Norris' => 'Hello, Chuck Norris!'
     */
    public static void getStringFromTemplate(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
        // getStringFromTemplate("John", "Doe");
    }

    /**
     * Extracts a name from template string 'Hello, First_Name Last_Name!'.
     *
     * @param {string} value
     * @return {string}
     *
     * @example
     *          'Hello, John Doe!' => 'John Doe'
     *          'Hello, Chuck Norris!' => 'Chuck Norris'
     */
    public static void extractNameFromTemplate(String value) {
        System.out.println(value.substring(7, value.length() - 1));
        // extractNameFromTemplate("Hello, John Doe!");
    }

    /**
     * Returns a first char of the given string.
     *
     * @param {string} value
     * @return {string}
     *
     * @example
     *          'John Doe' => 'J'
     *          'cat' => 'c'
     */
    public static void getFirstChar(String value) {
        char a = value.charAt(0);
        System.out.println(a);
        // getFirstChar("John Doe");
    }

    /**
     * Removes a leading and trailing whitespace characters from string.
     *
     * @param {string} value
     * @return {string}
     *
     * @example
     *          ' Abracadabra' => 'Abracadabra'
     *          'cat' => 'cat'
     *          '\tHello, World! ' => 'Hello, World!'
     */
    public static void removeLeadingAndTrailingWhitespaces(String value) {
        var a = value.trim();
        System.out.println(a);
        // removeLeadingAndTrailingWhitespaces(" Abracadabra");
    }

    /**
     * Returns a string that repeated the specified number of times.
     *
     * @param {string} value
     * @param {string} count
     * @return {string}
     *
     * @example
     *          'A', 5 => 'AAAAA'
     *          'cat', 3 => 'catcatcat'
     */
    public static void repeatString(String value, Integer count) {
        for (int i = 0; i < count; i++) {
            System.out.print(value);
        }
        System.out.println();
        // repeatString("A", 5);
    }

    /**
     * Remove the first occurrence of string inside another string
     *
     * @param {string} str
     * @param {string} value
     * @return {string}
     *
     * @example
     *          'To be or not to be', 'not' => 'To be or to be'
     *          'I like legends', 'end' => 'I like legs',
     *          'ABABAB','BA' => 'ABAB'
     */
    public static void removeFirstOccurrences(String str, String value) {
        System.out.println(str.replaceFirst(value, ""));
        // removeFirstOccurrences("To be or not to be", "not ");
    }

    /**
     * Remove the first and last angle brackets from tag string
     *
     * @param {string} str
     * @return {string}
     *
     * @example
     *          '<div>' => 'div'
     *          '<span>' => 'span'
     *          '<a>' => 'a'
     */
    public static void unbracketTag(String str) {
        System.out.println(str.substring(1, str.length() - 1));
        // unbracketTag("<div>");
    }

    /**
     * Converts all characters of the specified string into the upper case
     *
     * @param {string} str
     * @return {string}
     *
     * @example
     *          'Thunderstruck' => 'THUNDERSTRUCK'
     *          'abcdefghijklmnopqrstuvwxyz' => 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
     */
    public static void convertToUpperCase(String str) {
        System.out.println(str.toUpperCase());
        // convertToUpperCase("Thunderstruck");
    }

    /**
     * Extracts e-mails from single string with e-mails list delimeted by semicolons
     *
     * @param {string} str
     * @return {array}
     *
     * @example
     *          'angus.young@gmail.com;brian.johnson@hotmail.com;bon.scott@yahoo.com'
     *          => ['angus.young@gmail.com', 'brian.johnson@hotmail.com',
     *          'bon.scott@yahoo.com']
     *          'info@gmail.com' => ['info@gmail.com']
     */
    public static void extractEmails(String str) {
        String[] mass = str.split(";");
        int b = mass.length;
        for (int i = 0; i < b; i++) {
            if (i == b - 1) {
                System.out.println(mass[i]);
            } else {
                System.out.print(mass[i] + ", ");
            }
        }
        // extractEmails("angus.young@gmail.com;brian.johnson@hotmail.com;bon.scott@yahoo.com");
    }

    /**
     * Returns the string representation of rectangle with specified width and
     * height
     * using pseudograhic chars
     *
     * @param {number} width
     * @param {number} height
     * @return {string}
     *
     * @example
     *
     *          '┌────┐\n'+
     *          (6,4) => '│ │\n'+
     *          '│ │\n'+
     *          '└────┘\n'
     *
     *          (2,2) => '┌┐\n'+
     *          '└┘\n'
     *
     *          '┌──────────┐\n'+
     *          (12,3) => '│ │\n'+
     *          '└──────────┘\n'
     *
     */
    public static void getRectangleString(Integer width, Integer height) {
        for (int i = 1; i <= height; i++) {
            if (i == 1) {
                System.out.print("\"┌");
            } else if (i != 1 && i < height) {
                System.out.print("\"|");
            } else if (i == height) {
                System.out.print("\"└");
            }
            for (int j = 1; j <= width; j++) {
                if (i == 1 && j != 1 && j < width) {
                    System.out.print("-");
                } else if (i == 1 && j != 1 && j == width) {
                    System.out.println("┐\\n\"+");
                } else if (i != 1 && i < height && j != 1 && j < width) {
                    System.out.print(" ");
                } else if (i != 1 && i < height && j != 1 && j == width) {
                    System.out.println("|\\n\"+");
                } else if (i == height && j != 1 && j < width) {
                    System.out.print("-");
                } else if (i == height && j != 1 && j == width) {
                    System.out.println("┘\\n\"");
                }
            }
        }
        // getRectangleString(6,4);
    }

    /**
     * Returns playid card id.
     *
     * Playing cards inittial deck inclides the cards in the following order:
     *
     * 'A♣','2♣','3♣','4♣','5♣','6♣','7♣','8♣','9♣','10♣','J♣','Q♣','K♣',
     * 'A♦','2♦','3♦','4♦','5♦','6♦','7♦','8♦','9♦','10♦','J♦','Q♦','K♦',
     * 'A♥','2♥','3♥','4♥','5♥','6♥','7♥','8♥','9♥','10♥','J♥','Q♥','K♥',
     * 'A♠','2♠','3♠','4♠','5♠','6♠','7♠','8♠','9♠','10♠','J♠','Q♠','K♠'
     *
     * (see https://en.wikipedia.org/wiki/Standard_52-card_deck)
     * Function returns the zero-based index of specified card in the initial deck
     * above.
     * 
     * @param k
     *
     * @param {string} value
     * @return {number}
     *
     * @example
     *          'A♣' => 0
     *          '2♣' => 1
     *          '3♣' => 2
     *          ...
     *          'Q♠' => 50
     *          'K♠' => 51
     */
    public static void getCardId(String k) {
        String[] mass1 = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] mass2 = { "cross", "tambourine", "chirva", "peak" };
        String[] cards = new String[mass1.length * mass2.length];
        Integer number = 0;
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass1.length; j++) {
                cards[number] = mass1[j] + mass2[i];
                if (cards[number] == k) {
                    System.out.println(number);
                }
                number++;

            }
        }
    }

}
