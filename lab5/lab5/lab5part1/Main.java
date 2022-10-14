public class Main{
 
    public static void main(String[] args){
     WordGroup first = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");  
     WordGroup second = new WordGroup("When you play play hard when you work dont play at all");
     String[] firstArray = first.getWordArray();
     String[] secondArray = second.getWordArray();
     for(int i=0; i<firstArray.length;i++)
        System.out.println(firstArray[i]);
     for(int i=0; i<secondArray.length;i++)
        System.out.println(secondArray[i]);
    }
}