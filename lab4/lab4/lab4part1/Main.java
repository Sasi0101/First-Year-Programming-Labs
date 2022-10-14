public class Main{
 public static void main(String[] args){
     int randomNumber;
     int integerSum=0,x=1;
     int howManyIntegers=0;
     Toolbox myToolbox = new Toolbox();
     randomNumber = myToolbox.readIntegerFromCmd();
     for(int i=1; i<=20; i++){
        System.out.println(i*randomNumber + ", ");
        }
     while(integerSum < 500) {
         howManyIntegers++;
         integerSum = integerSum + x;
         x++;
     }
     System.out.println(howManyIntegers);
    }
}