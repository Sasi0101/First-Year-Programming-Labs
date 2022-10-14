public class GuessingGame {
  public static void main(String[] args) {
    Integer numberToGuess;
	Integer guessedNumber;
	Toolbox myToolBox = new Toolbox();
	System.out.println("Welcome to Guessing Game");
	numberToGuess = myToolBox.getRandomInteger(10);
	guessedNumber = myToolBox.readIntegerFromCmd();
	if(guessedNumber < numberToGuess) {
		System.out.println("too low");
	}
	if(guessedNumber > numberToGuess) {
		System.out.println("too high");
	}
	if(numberToGuess.equals(guessedNumber)) {
		System.out.println("right");
	}
  }
}