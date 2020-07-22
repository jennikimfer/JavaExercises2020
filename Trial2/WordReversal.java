import java.util.Scanner;

public class WordReversal {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scan.nextLine();

        // 0, length - 1
        // i-- ==> i = i-1;

        String phrase2 = "";
        for(int i = phrase.length()-1; i >= 0; i--){
            // phrase2 = phrase2.concat(phrase.charAt(i));
            // +=,, phrase2 = phrase2 + >new thing<
            // + and .concat() are the same thing
            phrase2 += phrase.charAt(i);
        }

        System.out.println(phrase2);
    }
}