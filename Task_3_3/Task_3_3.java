/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/


import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первое число = ");
        int a = scan.nextInt();
        System.out.println("");
        System.out.print("Второе число = ");
        int b = scan.nextInt();
        System.out.println("");
        System.out.println("Числа равны? " + func(a, b));

    }

    static boolean func (int a, int b) {
        if (a == b) return true;
        else return false;
    }
}
