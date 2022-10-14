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
 HashMap<String, Integer> getWordCounts(){
     HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
      for (String word : getWordArray()) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, (hashMap.get(word) + 1));
            } else {
                hashMap.put(word, 1);
            }
        }
     return hashMap;
    }
}