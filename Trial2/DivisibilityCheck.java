import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the first term of the range: ");
        int num1 = scan.nextInt();
        System.out.print("Input the final term of the range: ");
        int num2 = scan.nextInt();
        System.out.print("Input the factor: ");
        int factor = scan.nextInt();

        System.out.print("In the range [" + num1 + "," + num2 + "], the following are factors of " + factor + ": ");
        int counter = 0;
        for(int i = num1; i <= num2; i++){
            if(i%factor == 0){
                System.out.print(i + ", ");
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("\nThere are no factors.");
        } else{
            System.out.println("\nThere are " + counter + " factors.");
        }
    }
}