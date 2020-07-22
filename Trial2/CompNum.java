import java.util.Scanner;

public class CompNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = scan.nextDouble();

        System.out.print("Result: ");
        if(num1 == num2){
            System.out.println("They are the same numbers");
        } 
        else if(num1 > num2){
            if(num1%6 == num2%6){
                System.out.println(num2);
            } else{
                System.out.println(num1);
            }
        } else {
            if(num1%6 == num2%6){
                System.out.println(num1);
            } else{
                System.out.println(num2);
            }
        }
    }
}