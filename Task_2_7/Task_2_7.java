/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

import java.util.Scanner;

public class Task_2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean flag = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                System.out.println("true");
                break;
            }
        }

        if (!flag) {
            System.out.println("false");
        }

    }
}
