import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        char choice='y';
        do {


            System.out.print("Enter an operator \n 1. sqrt \n 2. factorial \n 3. log \n 4. power ");
            char operator = scanner.next().charAt(0);
            //scanner.close();
            double output=0.0;

            switch (operator) {
                case '1':
                    System.out.print("Enter first number:");
                    num1 = scanner.nextDouble();
                    try {
                        output = Math.sqrt(num1);
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    break;

                case '2':
                    //Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter first number:");
                    num1 = scanner.nextDouble();
//                System.out.print("Enter second number:");
//                num2 = scanner.nextDouble();
                    int i;
                    output = 1;
                    try {
                        for (i = 1; i <= num1; i++) {
                            output *= i;
                        }
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }

                    //output = num1;
                    break;

                case '3':
                    System.out.print("Enter first number:");
                    num1 = scanner.nextDouble();
                    try {
                        output = Math.log(num1);
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    break;

                case '4':
                    System.out.print("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number:");
                    num2 = scanner.nextDouble();
                    try {
                        output = Math.pow(num1, num2);
                    }catch(Exception e)
                    {
                        System.out.println(e);
                    }

                    break;

                default:
                    System.out.printf("You have entered wrong operator");
                    return;
            }

            System.out.println("Output: " + output);
            System.out.println("Press y to continue");
            choice = scanner.next().charAt(0);
        }while(choice=='y');
        scanner.close();
    }
}