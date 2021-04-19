/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Task_2_8 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int mult = 1;

        for (int i = 0; i < arr.length; i++) {
            mult *= arr[i];
        }

        System.out.println(mult);
    }
}
