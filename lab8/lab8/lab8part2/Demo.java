import java.util.ArrayList;
import java.util.Collections;

public class Demo{
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Wolf("Wolfy1", 2));
        animals.add(new Wolf("Wolfy2", 4));
        animals.add(new Parrot("Parry1", 6));
        animals.add(new Parrot("Parry2", 8));
        animals.add(new Raccoons("Racci1", 3));
        animals.add(new Raccoons("Racci2", 7));
        
        printAnimals(animals);
        Collections.sort(animals);
        printAnimals(animals);
    }
    
    static void printAnimals(ArrayList<Animal> animals){
        for(Animal i:animals){
            System.out.println(i.getName() + i.getAge());
        }
    }
}