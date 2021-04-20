class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int params = 0;
        if (this.age > anotherCat.age) params++;
        if (this.weight > anotherCat.weight) params++;
        if (this.strength > anotherCat.strength) params++;

        if (params >= 2) return true;
        else return false;
    }
}