public class ATM{
	public static void main(String[] args){
		ATM myATM = new ATM();
		myATM.go();
	}
	Toolbox myToolbox = new Toolbox();
	int balance;
	public void go(){
		System.out.println("Welcome to online ATM banking"); 
		System.out.println("How much do you want in your account?");
		balance = myToolbox.readIntegerFromCmd();
		System.out.println("What do you want to do?");
		System.out.println("1 : Withdraw");
		System.out.println("2 : Deposit");
		System.out.println("3 : Inquire");
		System.out.println("4 : Quit");
		int chosenNumber;
		chosenNumber = myToolbox.readIntegerFromCmd();
		if(chosenNumber == 1) withdraw();
		else if(chosenNumber == 2) deposit();
		else if(chosenNumber == 3) inquire();
		else quit();
	}
	public void withdraw(){
		int withdrawNumber;
		System.out.println("*****************************************");
		System.out.println("              Withdrawal");
		System.out.println("*****************************************");
		System.out.println("How much would you like to withdraw?");
		withdrawNumber = myToolbox.readIntegerFromCmd();
		System.out.println("*****************************************");
		System.out.println("         Your new balance is " + (balance-withdrawNumber));
		System.out.println("*****************************************");
	}
	public void deposit(){
		int depositNumber;
		System.out.println("*****************************************");
		System.out.println("              Deposit");
		System.out.println("*****************************************");
		System.out.println("How much would you like to deposit?");
		depositNumber = myToolbox.readIntegerFromCmd();
		System.out.println("*****************************************");
		System.out.println("         Your new balance is " + (balance+depositNumber));
		System.out.println("*****************************************");
	}
	public void inquire(){
		System.out.println("*****************************************");
		System.out.println("          Your balance is " + (balance));
		System.out.println("*****************************************");
	}
	public void quit(){
		System.out.println("*****************************************");
		System.out.println("         Goodbye!");
		System.out.println("*****************************************");
	}
		
}