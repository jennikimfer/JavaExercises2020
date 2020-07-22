import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        // +, - *, /, ^, |, [
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter operator: ");
        String operator = scan.next();

        double result;

        switch(operator){
            case "+": 
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case "^":
                result = Math.pow(num1, num2);
                System.out.println(num1 + " ^ " + num2 + " = " + result);
                break;
            case "|":
                System.out.print("The absolute value of " + num1 + " is ");
                if(num1 < 0){
                    num1 = num1 * -1;
                }
                System.out.println(num1);

                System.out.print("The absolute value of " + num2 + " is ");
                if(num2 < 0){
                    num2 = num2 * -1;
                }
                System.out.println(num2);
                break;
            case "[":
                result = Math.sqrt(num1);
                System.out.println("The square root of " + num1 + " is " + result);
                result = Math.sqrt(num2);
                System.out.println("The square root of " + num2 + " is " + result);
                break;
            default:
                System.out.println("That is not a valid operator.");
        }
    }
}