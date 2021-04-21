public class Horse extends Animal{
    String breed;
    String color;

    public Horse(boolean veg, String speak, byte paws, String breed, String color) {
        super(veg, speak, paws);
        this.breed = breed;
        this.color = color;
    }

    public void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}
