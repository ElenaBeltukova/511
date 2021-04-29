/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Мама", "Мыла", "Раму"};
        String str1, str2 = "";
        for (int i = 0; i < strings.length; i++){
            str1 = strings[i];
            for (int j = 0; j < strings.length; j++){
                if(j != i){
                    str2 = strings[j];
                    for (int k = 0; k < strings.length; k++){
                        if(k != i && k != j) {
                            System.out.println(str1 + str2 + strings[k]);
                        }
                    }
                }
            }
        }
    }
}
