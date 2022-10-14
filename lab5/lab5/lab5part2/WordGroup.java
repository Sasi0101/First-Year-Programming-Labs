import java.util.HashMap;
import java.util.HashSet;

public class WordGroup{
    String words;
    WordGroup(String in){
        words=in.toLowerCase();
    }
    String[] getWordArray(){
        return words.split(" ");
    }
    HashSet<String> getWordSet(WordGroup group){
        HashSet<String> wordSet = new HashSet<String>();
        String[] thisWord = this.getWordArray();
        String[] parameterWord = group.getWordArray();
        for(int i=0; i<thisWord.length; i++)
            wordSet.add(thisWord[i]);
        for(int i=0; i<parameterWord.length; i++)
            wordSet.add(parameterWord[i]);
        
        return wordSet;
    }
}