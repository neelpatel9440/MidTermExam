/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number is:");
        double num1 = scanner.nextDouble();

        System.out.println("second number is :");
        double num2 = scanner.nextDouble();

        // Prompt user to choose operation from ArithmeticOperation enum
        System.out.println("What you want to do?:");
        System.out.println("select 1 for PLUS");
        System.out.println("select 2 for MINUS");
        System.out.println("select 3 for MULTIPLY");
        System.out.println("select 4 for DIVIDE");
        int choice = scanner.nextInt();
        
        ArithmeticOperation operation = null;
        switch (choice) {
            case 1:
                operation = ArithmeticOperation.PLUS;
                break;
            case 2:
                operation = ArithmeticOperation.MINUS;
                break;
            case 3:
                operation = ArithmeticOperation.TIMES;
                break;
            case 4:
                operation = ArithmeticOperation.DIVIDE;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        ArithmeticBase arithmeticBase = new ArithmeticBase();
        double result = arithmeticBase.calculate(num1, num2, operation);

        System.out.println("Result: " + result);
    }
}
