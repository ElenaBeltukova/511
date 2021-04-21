package Person;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private int hp = 100;
    private Person mother;
    private Person father;

    public Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public String getInfo(){
        String info = "";
        info += "Меня зовут: " + this.getName() + "\n";
        info += "Имя моей мамы: " + this.getMother().getName() + "\n";
        info += "Имя моего папы: " + this.getFather().getName() + "\n";

        if (this.getFather().getMother() != null && this.getMother().getMother() != null) {
            info += "У меня две бабушки: " + this.getFather().getMother().getName() + " и " + this.getMother().getMother().getName() + "\n";
        } else if (this.getFather().getMother() != null) {
            info += "Имя моей бабушки: " + this.getFather().getMother().getName() + "\n";
        } else if (this.getMother().getMother() != null) {
            info += "Имя моей бабушки: " + this.getMother().getMother().getName() + "\n";
        }

        if (this.getFather().getFather() != null && this.getMother().getFather() != null) {
            info += "У меня два деда: " + this.getFather().getFather().getName() + " и " + this.getMother().getFather().getName() + "\n";
        } else if (this.getFather().getFather() != null) {
            info += "Имя моего деда: " + this.getFather().getFather().getName() + "\n";
        } else if (this.getMother().getFather() != null) {
            info += "Имя моего деда: " + this.getMother().getFather().getName() + "\n";
        }

        return info;

    }
}
