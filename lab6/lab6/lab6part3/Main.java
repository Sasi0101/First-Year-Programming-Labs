public class Main{
    public static void main(String[] args){
        Wolf wolf = new Wolf("wolfy", 15);
        Parrot parrot = new Parrot("parry", 20);
        Meat meat = new Meat("steak");
        Plant plant = new Plant("carrot");
        Raccoons rac = new Raccoons("Jack", 4);
        wolf.makeNoise();
        parrot.makeNoise();
        rac.makeNoise();
        try {
            parrot.eat(meat);
            wolf.eat(plant);
        }
        catch (Exception wrong){
            System.err.println(wrong);
        }
    }
}