public class Dog {
    private String name = "";
    private int age = 0;

    public void setName(String name) {
        if (name.equals("") || name.length() > 20) System.out.println("Ошибка в кличке!");
        else this.name = name;
    }
    public String getName() {
        if (this.name.equals("")) return "Без имени";
        else return this.name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) System.out.println("Ошибка в возрасте!");
        else this.age = age;
    }
    public int getAge() {
        return this.age;
    }
}
