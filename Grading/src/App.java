import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.println("******* This is an Grading Calculator *******" + "\n");

        //declare variables
        float mark;
        char result = '\0';

        //get user input
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter the marks");
        mark = marks.nextFloat();

        //Grading conditions 
        if (mark<= 100 && mark >= 0)
        {
            if (mark <= 100 && mark >= 75 )
            {
                result = 'A';
            }

            else if (mark <= 74 && mark >= 65)
            {
                result = 'B';
            }
            else if (mark <= 64 && mark >= 55)
            {
                result = 'C';
            }
            else if (mark <= 54 && mark >= 35)
            {
                result = 'S';
            }
            else 
            {
                result = 'F';
            }

        }
        else 
        {
            System.out.println("Invalid Marks Try Again !!!");
        }

        //display output
        System.out.println("Result for " + mark + " is = " + result);
    }
}
