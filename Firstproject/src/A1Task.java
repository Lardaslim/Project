import java.util.Scanner;

public class A1Task {
   static Scanner in = new Scanner(System.in);

   public static void main(String args[]) throws Exception {

      var a = "\nЗадание №";
      var b = ". Решение с применением ";
      var c = ":";

      System.out.print("\nВвести номер задания (1-8): ");

      int numberTask = in.nextInt();

      switch (numberTask) {
         case 1:
            System.out.println(a + 1 + b + "While" + c);
            M1to1(args);
            System.out.println(a + 1 + b + "For" + c);
            M1to2(args);
            A1Task.main(args);
         case 2:
            System.out.println(a + 2 + b + "While" + c);
            M2to1(args);
            System.out.println(a + 2 + b + "For" + c);
            M2to2(args);
            A1Task.main(args);
            in.close();
         case 3:
            System.out.println(a + 3 + b + "For" + c);
            M3(args);
            A1Task.main(args);
         case 4:
            System.out.println(a + 4 + c);
            M4(args);
            A1Task.main(args);
         case 5:
            System.out.println(a + 5 + c);
            M5(args);
            A1Task.main(args);
         case 6:
            System.out.println(a + 6 + c);
            M6(args);
            A1Task.main(args);
         case 7:
            System.out.println(a + 7 + c);
            M7(args);
            A1Task.main(args);
         case 8:
            System.out.println(a + 8 + c);
            M8a(args);
            break;

         default: {
            System.out.println("end");
         }
      }
   }

   public static void M1to1(String[] arguments) {
      var i = 1;

      while (i <= 5) {
         System.out.print(i + " ");
         i = i + 1;
      }
   }

   public static void M1to2(String[] arguments) {
      for (var i = 1; i <= 5; i = i + 1) {
         System.out.print(i + " ");
      }
   }

   public static void M2to1(String[] arguments) {
      var i = 5;

      while (i >= 1) {
         System.out.print(i + " ");
         i = i - 1;

      }
   }

   public static void M2to2(String[] arguments) {
      for (var i = 5; i >= 1; i = i - 1) {
         System.out.print(i + " ");
      }
   }

   public static void M3(String[] arguments) {
      var a = 3;

      for (var i = 1; i <= 10; i++) {
         System.out.println(a + "*" + i + "=" + (a * i));
      }
   }

   public static void M4(String[] arguments) {
      System.out.print("Введите число: ");
      int number = in.nextInt();

      var result = 0;
      for (var i = 1; i <= number; i++) {
         result = result + i;
      }

      System.out.println(result);
   }

   public static void M5(String[] arguments) {
      var residents = 10000000;
      var birth = 14;
      var death = 8;
      var years = 10;
      for (var i = 1; i <= years; i++) {
         residents = residents + birth - death;
      }
      System.out.println(residents);
   }

   public static void M6(String[] arguments) {
      float percent = 0.07f;
      System.out.println("Введите сумму вклада: ");
      float sum = in.nextInt();
      System.out.println("Введите срок вклада в месяцах: ");
      int period = in.nextInt();
      for (int i = 1; i <= period; i++) {
         sum = sum + (sum * percent);
      }
      System.out.printf("После %d месяцев сумма вклада составит %.6f\n", period, sum);
   }

   public static void M7(String[] arguments) {
      for (int i = 1; i <= 9; i++) {

         for (int j = 1; j <= 9; j++) {

            System.out.print(i * j + " ");
         }
         System.out.print("\n");
      }
   }

   public static void M8a(String[] arguments) {
      System.out.println("Введите первое число: ");
      int digit1 = in.nextInt();
      System.out.println("Введите второе число: ");
      int digit2 = in.nextInt();
      var res = digit1 * digit2;
      System.out.printf(
            "Результат умножения %d на %d равен: '%d'\n Завершить выполнение (1-да; 0-нет)?\n Введите команду:\n",
            digit1, digit2, res);
      int end = in.nextInt();
      if (end == 1) {
         System.out.println("End");
         return;
      } else {
         System.out.println("Повтор:");
         A1Task.M8a(arguments);
         return;
      }
   }
}
