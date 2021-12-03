import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        //get input from user
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Number 1 := ");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner (System.in);
        System.out.print("Enter Number 2 := ");
        int num2 = input2.nextInt();

        //calling method for output
        calculation(num1, num2);

    }

    public static void calculation(int num1 , int num2)
    {
        //conditions & Outputs
        if (num1 > num2)
        {
            System.out.println(num1 + " is bigger than " + num2);
        }
        else if (num1 == num2)
        {
            System.out.println("Two inputs are same");
        }
        else
        {
            System.out.println(num2 + " is bigger than " + num1);
        }
    }
}
