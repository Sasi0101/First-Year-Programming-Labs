import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
    String filename;
    String answer;
    Toolbox myToolbox=new Toolbox();
    int score=0;
    ArrayList<FlashCard> cards = new ArrayList<FlashCard>();
    Quiz(String filename){
        FlashCardReader cardReader=new FlashCardReader(filename);
        cards = cardReader.getFlashCards();
        play();
    }
    public static void main(String args[]) throws Exception{
        Quiz quiz = new Quiz("Questions.txt ");   
    }
    void play(){
        for(int i=0;i<cards.size();i++){
            System.out.println(cards.get(i).getQuestion());
            answer = myToolbox.readStringFromCmd();
            System.out.println(answer);
            if(answer.equals(cards.get(i).getAnswer())){
                score++;
                //writing out the answers for checking
                //System.out.println("right");
            } else{
                System.out.println("wrong");
                System.out.println("correct answer = " +cards.get(i).getAnswer());
            }
        }
    }
}