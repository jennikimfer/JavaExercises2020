import java.util.Scanner;

public class VirtualBank {
    public static String user;
    public static String pass;
    public static double money;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){        
        System.out.print("Username: ");
        user = scanResponse();
        System.out.print("Password: ");
        pass = scan.next();

        boolean isValid = true;
        boolean hasUpdated = false;
        while(isValid){
            System.out.print("\nWould you like to (a) change your password, (b) update your account, (c) make a deposit, or (d) withdraw money? ");
            String response = scanResponse();

            if(response.equals("a")){
                changePassword();
            } else if(response.equals("b")){
                hasUpdated = true;
                updateAccount();
            } else if(response.equals("c")){
                if(hasUpdated){
                    makeDeposit();                    
                } else{
                    System.out.println("\nYou must first update your account.");
                    continue;
                }
            } else if(response.equals("d")){
                if(hasUpdated){
                    withdrawMoney();
                } else{
                    System.out.println("\nYou must first update your account.");
                    continue;
                }
            } else{
                System.out.println("That is not a valid option.");
            }

            while(true){
                System.out.print("\nWould you like to (a) continue making changes or (b) log out? ");
                String repeat = scanResponse();
                if(repeat.equals("b")){
                    isValid = false;
                    break;
                } else if(repeat.equals("a")){
                    break;
                } else{
                    System.out.println("That is not a valid option.");
                }
            }
        }
        System.out.println("\nYou have successfully been logged out.");
    }

    public static String scanResponse(){
        return scan.next().toLowerCase();
    }

    public static void changePassword(){
        while(true){
            System.out.print("\nEnter your current password: ");
            String pass1 = scan.next();
            System.out.print("Enter your new password: ");
            String passNew = scan.next();
            System.out.print("Confirm your new password: ");
            String passCon = scan.next();
            
            if(!pass1.equals(pass)){
                System.out.println("That is not your current password.");
            } else if(!passNew.equals(passCon)){
                System.out.println("Your new passwords do not match.");
            } else{
                System.out.println("Your new password has been updated.");
                break;
            }
        }
    }

    public static void updateAccount(){
        while(true){
            System.out.print("\nEnter your username: ");
            String user1 = scanResponse();
            System.out.print("Enter your password: ");
            String pass1 = scan.next();

            if(!user1.equals(user)){
                System.out.println("Your username is incorrect.");
            } else if(!pass1.equals(pass)){
                System.out.println("Your password is incorrect.");
            } else{
                break;
            }
        }
        System.out.print("How much money do you currently have in your account? ");
        money = scan.nextDouble();
    }

    public static void makeDeposit(){
        while(true){
            System.out.print("\nEnter your password: ");
            String pass1 = scan.next();

            if(!pass1.equals(pass)){
                System.out.println("Your password is incorrect.");
            } else{
                break;
            }
        }
        System.out.print("How much money would you like to deposit? ");
        double deposit = scan.nextDouble();
        money += deposit;
        System.out.println("You have deposited $" + deposit + ".");
        System.out.println("You have $" + money + " in your account.");
    }

    public static void withdrawMoney(){
        while(true){
            System.out.print("\nEnter your password: ");
            String pass1 = scan.next();

            if(!pass1.equals(pass)){
                System.out.println("Your password is incorrect.");
            } else{
                break;
            }
        }
        System.out.print("How much money would you like to withdraw? ");
        double withdraw = scan.nextDouble();
        money -= withdraw;
        System.out.println("You have withdrawn $" + withdraw + ".");
        System.out.println("You have $" + money + " in your account.");
    }
}