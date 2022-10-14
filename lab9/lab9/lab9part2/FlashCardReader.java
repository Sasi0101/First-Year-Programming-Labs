
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {
    BufferedReader reader;
    FlashCardReader(String name) {
        try {
            this.reader = new BufferedReader(new FileReader(name));
        } catch (FileNotFoundException e) {
            System.out.println("Error loading file");
            e.printStackTrace();
        }
    }
    public String getLine() {
    String currentLine;
    try {
        if ((currentLine = reader.readLine()) != null) {
            return currentLine;
        }
    } catch (IOException e) {
        System.out.println("Error loading file");
        e.printStackTrace();
    }
    return "file is not ready";
    }
    public boolean fileIsReady() {
        try {
            if(this.reader != null) return reader.ready();
        } catch (IOException e) {
            System.out.println("Error loading file");
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<FlashCard> getFlashCards(){
       ArrayList<FlashCard> flashCards = new ArrayList<FlashCard>();
       while(fileIsReady()){
           String[] questionAndAnswer = getLine().split(":");
           flashCards.add(new FlashCard(questionAndAnswer[0], questionAndAnswer[1]));
       }
       return flashCards;
    }
}
