/*
Реализуй в классе Fox интерфейс Animal.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что создавать дополнительные классы и удалять методы нельзя!
Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В классе Fox должен быть реализован только один метод (getName).
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Main {
    public static void main(String[] args){
        Fox fox = new Fox();
        fox.getName();
        fox.getColor();
    }
}

interface Animals {
    default void getColor() {
        System.out.println("Рыжий");
    }
}

class Fox implements Animals {
    public void getName() {
        System.out.println("Fox");
    }
}
