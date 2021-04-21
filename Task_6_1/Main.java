import familyTree.Persons;

public class Main {
    public static void main(String[] args) {
        int medKit = 50;

        Persons nina = new Persons("Нина", 70, null,null);
        Persons petr = new Persons("Петр",80, null, null);

        Persons zina = new Persons("Зина", 85, null,null);
        Persons fedor = new Persons("Федор", 93, null,null);

        Persons olga = new Persons("Ольга",35, nina, petr);
        Persons oleg = new Persons("Олег",40,zina,fedor);

        Persons igor = new Persons("Игорь",13, olga, oleg);

        igor.getInfo();
    }
}
