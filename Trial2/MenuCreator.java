public class MenuCreator{

    public static void main(String[] args){
        // hamburger = $3.50
       double hamburger = 7.5;
       // drink = $1.00
       double drink = 1;
       double hamburger2 = hamburger*2;
       double combo = hamburger + drink;
       
       System.out.println("Menu \nHamburger: " + hamburger +
        "\nDrink: " + drink + 
        "\n2 Hamburgers: " + hamburger2 + 
        "\nCombo: " + combo);

        // (int) --> (double) = 3 --> 3.0
        // (double) --> (int) = 3.0 --> 3 = 3.5 --> 3
        int amount = (int)(hamburger/drink);
        System.out.println("You can buy " + amount + " drinks for 1 hamburger");
    }
}