import java.util.Scanner;

public class Lesson2 {
    public static void main (String [] args){
        sumNumbers();
        artNum();
        oneNum();
        Years();
        printN();
    }

    public static void sumNumbers() {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        if (number1 + number2 >= 10 && number1 + number2 <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


    public static void artNum() {
        Scanner sc1 = new Scanner(System.in);
         System.out.println ("Введите любое целое число");
         int input = sc1.nextInt();
         if (input >= 0) {
            System.out.println("Число положительное");
         } else {
             System.out.println ("Число отрицательное");
         }

    }

    static void oneNum () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = sc.nextInt();
        boolean c = a < 0;
        System.out.println(c);
    }

    public static void printN() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите строку и число");
        int n = Integer.parseInt(scn.nextLine());
        String z = scn.nextLine();
        for(int i=0; i<n; i++) System.out.println(z);
    }


    static void Years() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Определить високосный ли год");
        int year = sc1.nextInt();
        boolean x = ((year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)));
        System.out.println(x);
    }



}

