import java.lang.Math;
import java.util.Scanner;

public class CircleCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input radius: ");
        double radius = scan.nextDouble();

        double area = radius*radius*Math.PI;
        double circumference = 2*radius*Math.PI;

        System.out.println("\nArea: " + area);
        System.out.println("Circumference: " + circumference);
    }
}