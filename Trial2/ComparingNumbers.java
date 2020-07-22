import java.util.Scanner;
import java.lang.Math;

public class ComparingNumbers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Input second number: ");
        double num2 = scan.nextDouble();

        if(num1 == num2){
            System.out.println("The two numbers are equal.");
        } else{
            if(num1 > num2){
                System.out.println(num1 + " is greater than " + num2);
            } else{
                System.out.println(num1 + " is less than " + num2);
            }
        }
    }
}