import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //declare variables
        float num1;
        float num2;
        char oper;
        float answer = 0;

        //get 1st input 
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter number 1 := ");
        num1 = input1.nextFloat();

        //display operators
        System.out.println("--------------");
        System.out.println("+ = Addition");
        System.out.println("- = Substraction");
        System.out.println("/ = Divide");
        System.out.println("* = Multiplication");
        System.out.println("--------------");
        
        //get operator input from user
        Scanner operator = new Scanner(System.in);
        System.out.print("Enter the Operator := ");
        oper = operator.next().charAt(0);

        //get 2nd input
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the Number 2 := ");
        num2 = input2.nextFloat();

        //calculations
        switch (oper)
        {
            case '+' :
                answer = addition(num1, num2);
                break;
            
            case '-':
                answer = num1 - num2;
                break;

            case '/':
                answer = num1 / num2;
                break;

            case '*':
                answer = num1 * num2;
                break;

            default:
                System.out.println("Invalid Operator !!!");

        }

        //final output
        System.out.println("************* ANSWER *************");
        System.out.println("\t" + num1 + " " + oper+" "+ num2 + " = " + answer);
        System.out.println("**********************************");
    }

    public static float addition(float num1 , float num2)
    {
        return num1 + num2;
    }
}
