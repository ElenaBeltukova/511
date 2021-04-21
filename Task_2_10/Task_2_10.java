/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Task_2_10 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 4};
        boolean flag = false;
        int num;

        num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num == arr[i]) {
                flag = true;
                System.out.println("Да");
                break;
            } else {
                num = arr[i];
            }
        }

        if (!flag) {
            System.out.println("Нет");
        }
    }
}
