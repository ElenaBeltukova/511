/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Task_2_9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                flag = true;
                System.out.println("Да");
                break;
            }
        }

        if (!flag) {
            System.out.println("Нет");
        }
    }
}
