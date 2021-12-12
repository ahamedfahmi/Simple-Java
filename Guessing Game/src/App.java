import java.util.Scanner;


public class App {
    public static void main(String[] args) {
                //declare variables
                String secretWord ;
                String user_input;
                int guessCount = 0;
                int guessLimit = 3;
                boolean remainingGuess = false;
        
                //set Secrect Word (SW)
                secretWord = "Java";
        
                //Clue prompt
                System.out.println("******* Here Your Clues *******");
                System.out.println("### One of the top language ###");
                System.out.println("### Starting letter is J    ###");
                System.out.println("******* Now find the word *******");
        
                //get input from user
                Scanner input = new Scanner(System.in);
                System.out.print("Guess the word := ");
                user_input = input.nextLine();
                
                //conditions and loops

                while (!user_input.equals(secretWord) && !remainingGuess)
                {
                    if (guessCount < guessLimit) {
                        System.out.println("Not Correct :(");
                        System.out.print("Guess the word := ");
                        user_input = input.nextLine();

                        guessCount ++; // increment of guessCount
                    }
                    else{
                        remainingGuess = true;
                        break;
                    }
                }

                System.out.println("Yes , Your Correct :)");

                
    }
}
