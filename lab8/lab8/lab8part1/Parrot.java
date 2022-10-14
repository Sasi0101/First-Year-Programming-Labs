public class Parrot extends Herbivore {
    public void makeNoise() {
        System.out.println("Parrot noise");
    }
    public Parrot(String name, int age) {
        super(name, age);
    }
    public Parrot(int age){
        super("Polly", age);
    }
}