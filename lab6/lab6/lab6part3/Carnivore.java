public abstract class Carnivore extends Animal{
    Carnivore(String name, int age){
        super(name, age);
    }
    public void eat(Food food) throws Exception{
       if(food instanceof Meat) {
           System.out.println("eating");
        } else throw new Exception("Carnivore eats only food");
    }
}