import java.util.Scanner;

public class SimpleCalculator2 {
    public static void main(String[] args){
        // +, - *, /, ^, |, [
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter operator: ");
        String operator = scan.next();

        double result = 1;

        switch(operator){
            case "+": 
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            case "^":
                result = power(num1, num2);
                break;
            default:
                System.out.println("That is not a valid operator.");
        }

        printResult(num1, num2, result, operator);
    }

    public static void printResult(double num1, double num2, double result, String operator){
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1*num2;
    }

    public static double divide(double num1, double num2){
        return num1/num2;
    }

    public static double power(double num1, double num2){
        return Math.pow(num1, num2);
    }
}