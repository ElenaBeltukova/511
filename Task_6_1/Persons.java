package familyTree;

public class Persons{
    private String name;
    private int age;
    private int hp;
    private Persons mother;
    private Persons father;

    public Persons(String name, int age, Persons mother, Persons father) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public void getInfo(){
        String info= "Меня зовут "+this.name+"\n";
        if(this.mother != null){
            info += "Мою маму зовут "+this.mother.name+"\n"; // info = info + "Мою маму...";
            if (this.mother.mother != null){
                info += "Бабушка по маме "+this.mother.mother.name+"\n";
            }
            if (this.mother.father != null){
                info += "Дедушка по маме "+this.mother.father.name+"\n";
            }
        }
        if(this.father != null){
            info += "Моего папу зовут "+this.father.name+"\n";
            if (this.father.mother != null){
                info += "Бабушка по папе "+this.father.mother.name+"\n";
            }
            if (this.father.father != null){
                info += "Дедушка по папе "+this.father.father.name+"\n";
            }
        }
        System.out.println(info);
    }
    public Persons getMother() {
        return mother;
    }
    public Persons getFather() {
        return father;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        if(this.hp + hp > 100) this.hp = 100;
        else this.hp = this.hp + hp;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}