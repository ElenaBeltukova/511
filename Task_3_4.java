/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/


import java.util.Scanner;

public class Task_3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первое число = ");
        int a = scan.nextInt();
        System.out.println("");
        System.out.print("Второе число = ");
        int b = scan.nextInt();
        System.out.println("");
        System.out.println("Их сумма больше 10? " + func2(a, b));

    }

    static boolean func2 (int a, int b) {
        if (a + b > 10) return true;
        else return false;
    }
}
