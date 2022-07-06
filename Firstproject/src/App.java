public class App {
    public static void main(String[] args) throws Exception {
        pro15(args);
    }

//Арифметические операции
    public static void pro6(String[] args) {
        System.out.println(81 / 9);        
}

//Операторы
    public static void pro7(String[] args) {
        System.out.println(6 - -81);
}

//Коммутативная операция
    public static void pro8(String[] args) {
        System.out.println(3 * 5);
        System.out.println(-8 / -4);        
}

//Композиция операций
    public static void pro9(String[] args) {
        System.out.println(8 / 2 + 5 - -3 / 2);        
}

//Приоритет операций
    public static void pro10(String[] args) {
        System.out.println(70 * (3 + 4) / (8 + 2));
}

//Числа с плавающей точкой
    public static void pro11(String[] args) {
        System.out.println(0.39 * 0.22);        
}

//Линтер
    public static void pro12(String[] args) {
        System.out.println((5 + 2) - (3 * 7));        
}

//Кавычки
    public static void pro13(String[] args) {
        System.out.println("\"Khal Drogo's favorite word is \"athjahakar\"\"");
}

//Экранирующие последовательности
    public static void pro14(String[] args) {
        System.out.println("- Did Joffrey agree?\n- He did. He also said \"I love using \\n\".");
}

//Конкатенация
    public static void pro15(String[] args) {
        System.out.println("Winter " + "came " + "for " + "the " + "House " + "of " + "Frey.");
}

//Что такое переменная
    public static void pro16(String[] args) {
        var motto = "What Is Dead May Never Die!";
        System.out.println(motto);
}

//Изменение переменной
    public static void pro17(String[] args) {
        var name = "Brienna";
        name = "anneirB";
        System.out.println(name);
}

//Выбор имени переменной
    public static void pro18(String[] args) {
        var firstNumber = 1.10;
        var secondNumber = -100;
        System.out.println(firstNumber * secondNumber);
}

//Ошибки при работе с переменными
    public static void pro19(String[] args) {
        var family = "Targaryen";
        var pet = "Dragon";        
        System.out.print(family);
        System.out.print(" and ");
        System.out.print(pet);
}

//Выражения в определениях
    public static void pro20(String[] args) {
        var eurosCount = 100;
        var dollarsCount = eurosCount * 1.25;
        var rublesCount = dollarsCount * 60;
        System.out.print(dollarsCount);
        System.out.print("\n");
        System.out.print(rublesCount);
        System.out.print("\n");        
}

//Переменные и конкатенация
    public static void pro21(String[] args) {
        var info = "We couldn't verify you mother's maiden name.";
        var intro = "Here is important information about your account security.";
        var firstName = "Joffrey";
        var greeting = "Hello";
        System.out.println(greeting + ", " + firstName + "!");
        System.out.println(intro + "\n" + info);
}

//Именование переменных
    public static void pro22(String[] args) {
        var firstNumber = 11;
        var secondNumber = -100;
        System.out.println(firstNumber * secondNumber);        
}

//Магические числа
    public static void pro23(String[] args) {
        var king = "King Balon the 6th";
        var numberOfKastles = 6;
        var roomsPerCastle = 17;
        System.out.println(king + " has " + (numberOfKastles * roomsPerCastle) + " rooms.");    
}

//Константы
    public static void pro24(String[] args) {
        final var DRAGONS_BORN_COUNT = 3; 
        System.out.println(DRAGONS_BORN_COUNT);       
}

//Зачем нужны типы данных
    public static void pro25(String[] args) {
        System.out.println(3 / 2);
}

//Явная типизация
    public static void pro26(String[] args) {
        String abc = "One more time";
        System.out.println(abc);
}

//Какие бывают типы
    public static void pro27(String[] args) {
        System.out.println("hexlet" + "-" + 7);         
}

//Значение null
    public static void pro28(String[] args) {
        String greeting;        
        greeting = "Hello Hexlet!";
        System.out.println(greeting);
}

//Явное преобразование типов
    public static void pro29(String[] args) {
        System.out.println((int) 2.9 + " times");        
}

//Методы и их вызов
    public static void pro30(String[] args) {
        var company1 = "Apple";
        var company2 = "Samsung";
        var company1Length = company1.length();
        var company2Length = company2.length();       
        System.out.println(company1Length + company2Length);        
}

//Параметры методов
    public static void pro31(String[] args) {
        var one = "Naharis";
        var two = "Mormont";
        var three = "Sand";
        var char1 = one.charAt(2);
        var char2 = two.charAt(1);
        var char3 = three.charAt(3);
        var char4 = two.charAt(4);
        var char5 = two.charAt(2);
        System.out.println(char1 + " " + char2 + " " + char3 + " " + char4 + " " + char5);         
}

//Вызов метода — выражение
    public static void pro32(String[] args) {
        var text = "Never forget what you are, for surely the world will not";
        var result = "First: " + text.charAt(0) + "\nLast: " + text.charAt(text.length() - 1);
        System.out.println(result);
}

//Неизменяемость строк
    public static void pro33(String[] args) {
        var email = " SupporT@hexlet.io\n";
        email = email.trim();
        email = email.toLowerCase();
        System.out.println(email);
}

//Цепочки вызовов методов
    public static void pro34(String[] args) {
        var name = "hexlet";
        var capitalization = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(capitalization);
}

//Детерминированность
    public static void pro35(String[] args) {
        System.out.println((int) (Math.random() * 10));
}
/*
//Побочные эффекты
    public static void pro36(String[] args) throws IOException {
        var path = Paths.get("Test.java");
        var data = Files.readString(path);
        System.out.println(data);
}

//Стандартная библиотека
    public static void pro37(String[] args) {
        LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
}
*/
//Какие бывают методы
    public static void pro38(String[] args) {
        var emoji = "-(";
        var resultEmoji = ":" + emoji.replace("(", ")");
        System.out.println(resultEmoji);        
}

//Создание (определение) метода
    public static void printMotto() {
    System.out.println("Winter is coming");         
}
/*
//Возврат значений                      !!!!!!!!!!!!!!
public static int getCurrentYear() {
    var date = LocalDate.now();
    return Integer.parseInt(date.toString().substring(0,4));
}
*/
//Параметры методов                        !!!!!!!!!!!!!
public static String truncate(String text, int de) {
    return text.substring(0, de) + "...";
}

//Код для тренировки
public static char itsok(String sit) {
    return(sit.charAt(sit.length() - 1));

}
/*
public static String getHiddenCard(String cardNumber, int starsCount) {
    var visibleDigitsLine = cardNumber.substring(12);
    return StringUtils.leftPad(visibleDigitsLine, starsCount + 4, '*');
};

//Необязательные параметры методов              !!!!!!!!!!!
public static String getHiddenCard(String cardNumber, int starsCount) {
    var visibleDigitsLine = cardNumber.substring(12);
    return StringUtils.leftPad(visibleDigitsLine, starsCount + 4, '*');
};

public static String getHiddenCard(String cardNumber) {
    return App.getHiddenCard(cardNumber, 4);
};
*/

//Логический тип
public static boolean isPensioner(int age) {
    return age >= 60;
}

/*
//Сравнение строк                                      !!!!!!!!!!!!!!!!
public static boolean isPalindrome(String word) {
    var normalizedWord = word.toLowerCase();
    var reversedWord = StringUtils.reverse(normalizedWord);
    return normalizedWord.equals(reversedWord);
}
*/
//Комбинирование операций и методов
public static boolean isInternationalPhone(String phone) {
    return phone.charAt(0) == '+';
}    

//Логические операторы
public static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); 
}
/*
//Отрицание
public static boolean notToday(String dateAsString) {
    var date = LocalDate.now();
    return !dateAsString.equals(date.toString());
}

*/
public static String twosumm(Integer a, Integer b) {
      return "Summ=" + (a + b);
}

//Условная конструкция (if)  №48
//Мой вариант
public static String getSentenceTone(String sentence) {
    if (sentence == sentence.toUpperCase()) {
    return "scream";
    }
    return "normal";
}
//Вариант учителя
public static String getSentenceTone1(String sentence) {
    if (sentence.equals(sentence.toUpperCase())) {
    return "scream";
    }
    return "normal";
}

//Конструкция if-else №49
public static String normalizeUrl(String Url) {
    var a = "https://";
        if (Url.startsWith(a)) {
             return Url; 
        }
        else {
        return a + Url;
    }
}

//Конструкция else if №50
//Моё решение
public static String whoIsThisHouseToStarks(String lastName) {
    var a = "Karstark";
    var b = "Tally";
    var c = "Lannister";
    var d = "Frey";
    if ((lastName == a) || (lastName == b)) {
        return "friend";
    }
    else if ((lastName == c) || (lastName == d)) {
        return "enemy";
    }
    else {
        return "neutral";
    }
}     

//Решение учителя
public static String whoIsThisHouseToStarks1(String houseName) {
    if ("Karstark".equals(houseName) || "Tally".equals(houseName)) {
        return "friend";
    } else if ("Lannister".equals(houseName) || "Frey".equals(houseName)) {
        return "enemy";
    }
return "neutral";
}

//Тернарный оператор
//Решение учителя
/*
public static String convertString(String str) {
    return Character.isUpperCase(str.charAt(0)) ? str : StringUtils.reverse(str);
}
//Моё решение 1
public static String convertString(String text) {
    if (text == "") {
        return "";
    }
    else if (Character.isUpperCase(text.charAt(0))) {
        return text;
}
    else {
        return StringUtils.reverse(text);
        }
//Моё решение 2 (сокращённое)
public static String convertString(String text) {
    if (text == "") {
        return "";
    }
    else {
        return Character.isUpperCase(text.charAt(0)) ? text : StringUtils.reverse(text);
        }
}   
*/

//Конструкция Switch (где ставить "break"???)
public static String getNumberExplanation(int number) {
    switch (number) {
    case 666:
        return "devil number";
    case 42:
        return "answer for everything";
    case 7:
        return "prime number";
    default: 
        return null;
}
}    

//Цикл While №53
public static void printNumbers(int firstNumber) {
var i = firstNumber;
while (i >= 1 ) {
System.out.println(i);
i = i - 1;
}
System.out.println("finished!");
}

//Агрегация данных (Числа) №54
public static int multiplyNumbersFromRange(int start, int finish) {
var i = start;
var multiply = 1;
while (i <= finish) {
multiply = multiply * i;
i = i + 1;
}        
return multiply;
}

//Агрегация данных (Строки) №55
public static String joinNumbersFromRange(int start, int finish) {
var numbers = "";
var i = start;
while (i <= finish) {
numbers = numbers + i;
i = i + 1;
}
return numbers;
}

//Обход строк №56
public static void printReversedNameBySymbol(String name) {
var i = name.length() - 1;
while (i >= 0) {
System.out.println(name.charAt(i));
i = i + -1;
}
}        

//Условия внутри тела цикла №57
public static int countChars(String str, char ch) {
var i = 0;
var count = 0;
while (i < str.length()) {
    if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
        count = count + 1;
    }
    i = i + 1;
}        
 return count;
}

//Формирование строк в циклах №58
public static String reverse(String str) {
    // BEGIN (write your solution here)
var i = str.length() - 1;
var result = "";
while (i >= 0) {
result = result + str.charAt(i);
i = i + -1;
}        
return result;
    // END
}

//Синтаксический сахар №59
public static String filterString(String str, char ch) {
    var i = 0;
    var result = "";
    while (i < str.length()) {
        var currentChar = str.charAt(i);
        if (currentChar != ch) {
            result = result + currentChar;
        }
        i += 1;
    }
return result;
}

//Инкремент и декремент №60
public static String makeItFunny(String str, int n) {
var i = 0;
    var result = "";
    while (i < str.length()) {
        var current = str.charAt(i);
        if ((i + 1) % n == 0) {
            result = result + Character.toUpperCase(current);
        } else {
            result = result + current;
        }
    i++;
}
return result;
}


//Возврат из циклов №61
public static boolean hasChar(String str, char ch) {
 var i = 0;
    while (i < str.length()) {
        if (str.charAt(i) == ch) {
            return true;
        }
        i += 1;
    }
        return false;
}

//Цикл For №62
public static String encrypt(String str) {
    // BEGIN
    var result = "";
    for (var i = 0; i < str.length(); i += 2) {
        var nextSymbol = (i + 2 > str.length()) ? "" : str.substring(i + 1, i + 2);
        result = result + nextSymbol + str.charAt(i);
    }

    return result;
    // END
}

}