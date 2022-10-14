public class FizzBuzz 
{
  public static void main(String[] args)
  {
   for(Integer i = new Integer(1); i < 61; i++)
   {
     if(i % 3 != 0 && i % 5 != 0)
	 {
       System.out.print(i); //write i on the cmd if i is not divisible by 3 or 5
     }

     if(i % 3 == 0)
	 {
       System.out.print("Fizz"); //write Fizz on the cmd if i is divisible by 3
	 }

     if(i % 5 == 0)
	 {
       System.out.print("Buzz"); //write Buzz on the cmd if i is divisible by 5
	 }
     System.out.println();
    }
  }
}