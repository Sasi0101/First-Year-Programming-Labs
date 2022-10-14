public abstract class Herbivore extends Animal{
    Herbivore(String name, int age){
        super(name, age);
    }
    public void eat(Food food) throws Exception{
        if(food instanceof Plant)
            System.out.println(this.name + "is eating");
        else throw new Exception (this.name + "does not eat meat");
    }
}