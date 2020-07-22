public class NumberPatterns{
    public static void main(String[] args){
        // 1~100, /3, /5, /3 and 5
        // divisible by 3
        System.out.println("Terms divisble by 3: ");
        int c1 = 0;
        for(int i=1; i<101; i++){
            if(i%3 == 0){
                System.out.print(i + ", ");
                c1++;
            }
        }
        System.out.println("\n" + c1 + " terms are divisible by 3");

        // divisible by 5
        System.out.println("Terms divisble by 5: ");
        int c2 = 0;
        for(int i=1; i<101; i++){
            if(i%5 == 0){
                System.out.print(i + ", ");
                c2++;
            }
        }
        System.out.println("\n" + c2 + " terms are divisible by 5");

        // divisible by 3 and 5
        System.out.println("Terms divisble by 3 and 5: ");
        int c3 = 0;
        for(int i=1; i<101; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.print(i + ", ");
                c3++;
            }
        }
        System.out.println("\n" + c3 + " terms are divisible by 3 and 5");

        // divisible by 3 or 5
        System.out.println("Terms divisble by 3 or 5: ");
        int c4 = 0;
        for(int i=1; i<101; i++){
            if(i%3 == 0 || i%5 == 0){
                System.out.print(i + ", ");
                c4++;
            }
        }
        System.out.println("\n" + c4 + " terms are divisible by 3 or 5");

    }
}