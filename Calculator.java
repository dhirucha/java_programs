import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter operation (+,-,/,*):");
        char operation = scanner.next().charAt(0);

        double result;
        switch(operation) {
            case '+':
                result = num1 + num2;
                break;
                
            case '-':
                result = num1 - num2;
                break;
            
            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num2 != 0 ? num1 / num2 : Double.NaN;
                break;
            default:
            System.out.println("Invalid operation choosen!");
            return;
        }

        System.out.println("The result is : " + result);
        scanner.close();

    }
    

}
