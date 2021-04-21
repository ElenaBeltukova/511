/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Task_2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Сумма вклада = ");
        double sum = scan.nextDouble();
        System.out.print("Процент = ");
        double pr = scan.nextDouble();
        System.out.print("На сколько лет = ");
        int year = scan.nextInt();

        for (int i = 0; i < year; i++) {
            sum += sum * pr / 100;
            System.out.println((i + 1) + ". " + sum);
        }
    }
}
