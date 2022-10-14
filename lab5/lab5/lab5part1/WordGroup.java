public class WordGroup{
    String words;
    WordGroup(String in){
        words=in.toLowerCase();
    }
    String[] getWordArray(){
        return words.split(" ");
    }
}