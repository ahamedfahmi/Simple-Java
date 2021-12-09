import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.println("******* This is an Grading Calculator *******" + "\n");

        //declare variables
        float mark;
        String name;

        //get user name
        Scanner uname = new Scanner(System.in);
        System.out.print("Enter Your Name := ");
        name = uname.nextLine();

        //get user input
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter the marks := ");
        mark = marks.nextFloat();

        //calling method
        grading(name , mark);

        //decoration :)
        System.out.println("\n"+"******* Thank you *******");
    }

    //declare method
    public static void grading(String name , float mark)
    {
        char result = '\0'; //declare result in this method 
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

        //display output
        System.out.println(name + "'s Mark is " + mark);
        System.out.println(name + "'s Result is " + result);

        }
        else 
        {
            System.out.println("Invalid Marks Try Again !!!");
        }
    }
}
