import java.util.Scanner;


public class App {
    public static void main(String[] args) {
                //declare variables
                String Secrect_Word ;
                String user_input;
        
                //set Secrect Word (SW)
                Secrect_Word = "Java";
        
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

                while (!user_input.equals(Secrect_Word))
                {
                    System.out.println("Not Correct :(");
                    System.out.print("Guess the word := ");
                    user_input = input.nextLine();
                }
                System.out.println("Yes , Your Correct :)");

                
    }
}
