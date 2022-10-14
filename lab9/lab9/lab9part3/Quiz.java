import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
    String filename;
    String answer;
    String saveAnswers;
    Toolbox myToolbox=new Toolbox();
    int score=0;
    boolean saveAnswersBoolean=false;
    ArrayList<String> userAnswer = new ArrayList<String>();
    ArrayList<FlashCard> cards = new ArrayList<FlashCard>();
    Quiz(String filename) throws Exception{
        FlashCardReader cardReader=new FlashCardReader(filename);
        cards = cardReader.getFlashCards();
        play();
    }
    public static void main(String args[]) throws Exception{
        Quiz quiz = new Quiz("Questions.txt ");  
    }
    void play() throws Exception{
        System.out.println("Would you like to save the results?");
        saveAnswers = myToolbox.readStringFromCmd();
        for(int i=0;i<cards.size();i++){
            System.out.println(cards.get(i).getQuestion());
            answer = myToolbox.readStringFromCmd();
            System.out.println(answer);
            if(answer.equals(cards.get(i).getAnswer())){
                score++;
                userAnswer.add(cards.get(i).getQuestion()+","+answer+","+"right");
                //writing out the answers for checking
                //System.out.println("right");
            } else{
                System.out.println("wrong");
                System.out.println("correct answer = " +cards.get(i).getAnswer());
                userAnswer.add(cards.get(i).getQuestion()+","+answer+","+"wrong");
            }
        }
        if(saveAnswers.equals("Y")) save();
    }
    //saving it
    void save() throws Exception{
        PrintStream saveFile = null;
        try{
            saveFile = new PrintStream(new File("save.txt"));
        } catch (FileNotFoundException e){
            System.out.println("Error creating the save.txt file");
            e.printStackTrace();
        }
        for(String i : userAnswer){
            saveFile.println(i);    
        }
        saveFile.println(score + "," + cards.size() + "," + (float)((score*100)/cards.size()));
        //saveFile.println(score); saveFile.print(cards.size()/2);  saveFile.print( (float)((score/cards.size())/100));
        }
}