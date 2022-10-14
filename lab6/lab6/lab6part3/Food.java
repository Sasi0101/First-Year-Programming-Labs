public class Food{
   protected String foodType;
   
   public Food(String foodType){
     this.foodType= foodType;
    }
   public String getFoodName(){
     return foodType;  
    }
}