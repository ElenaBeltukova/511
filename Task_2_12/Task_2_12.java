/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Task_2_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {2, 4, 4, 4, 8, 8, 4, 12, 12, 14};
        int count = 10; // количество элементов введенных с клавиатурв
        int len = 1; // текущая длина последовательности
        int max = 1; // максимальная длина последовательности
        int arrSize; // итоговый массив
        int num; // повторяющееся число
        arrSize = count + arr.length;
        int[] arr2 = new int[arrSize];

        // копируем значения данного массива в большой
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        // дописываем в большой массив числа введенные с клавиатуры
        for (int i = 0; i < count; i++) {
            arr2[arr.length + i] = scan.nextInt();
        }

        // вывод массива на экран
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // находим самую длинную последовательность
         num = arr2[0];
         for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] == num) {
                len++;
            }

            if (arr2[i] != num || i == arr2.length-1) { // если прервалась цепочка одинаковых чисел
                if (len > max) {
                    max = len;
                }
                len = 1;
            }

            num = arr2[i];
        }

        System.out.print("Длина последовательности " + max);


    }
}
