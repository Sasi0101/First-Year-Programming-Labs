public abstract class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    abstract void makeNoise();
    public abstract void eat(Food food) throws Exception;
    public void eat(Food food, int number) throws Exception{
        for(int i=0; i<number;i++){
            eat(food);
        }
    }
    Animal(){
        this("newborn", 0);
    }
}