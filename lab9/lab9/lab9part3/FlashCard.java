public class FlashCard{
    String question, answer;
    FlashCard(String question, String answer){
        this.question=question;
        this.answer=answer;
    }
    //getting the answer and the question
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    
}