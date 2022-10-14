import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main{
 
    public static void main(String[] args){
     WordGroup first = new WordGroup(" You can discover more about a person in an hour of play than in a year of conversation ");  
     WordGroup second = new WordGroup(" When you play play hard when you work dont play at all ");
     String[] firstArray = first.getWordArray();
     String[] secondArray = second.getWordArray();
     for(int i=0; i<firstArray.length;i++)
        System.out.println(firstArray[i]);
     for(int i=0; i<secondArray.length;i++)
        System.out.println(secondArray[i]);
       
     HashSet<String> hashSet = first.getWordSet(second); //complete word set
     for(String i : hashSet) System.out.println(i);
     
     HashMap<String, Integer> firstHash = first.getWordCounts();
     HashMap<String, Integer> secondHash = second.getWordCounts();
     Set<String> firstSet = firstHash.keySet();
     Set<String> secondSet = secondHash.keySet();
     for(String i: firstSet) 
        System.out.println(i + ": " + firstHash.get(i));
     for(String i: secondSet) 
        System.out.println(i +": " + secondHash.get(i));
     for(String i : hashSet){
        int wordCount=0;
        for(String x : firstSet){
                if(i.equals(x)) wordCount=wordCount + firstHash.get(x);
            }
        for(String y : secondSet){
                if(i.equals(y)) wordCount=wordCount + secondHash.get(y);
            }
        System.out.println(i + wordCount);
    }
}
}