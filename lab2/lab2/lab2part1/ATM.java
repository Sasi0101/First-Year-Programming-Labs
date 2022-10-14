public class ATM{
	public static void main(String[] args){
		ATM myATM = new ATM();
		myATM.go();
	}
	Toolbox myToolbox = new Toolbox();
	public void go(){
		int x;
		System.out.println("Welcome to online ATM banking"); 
		System.out.println("How much do you want in your account?");
		x = myToolbox.readIntegerFromCmd();
		System.out.println(x);
	}
}