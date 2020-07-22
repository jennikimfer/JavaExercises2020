public class PrimeNumSum{
    public static void main(String[] args){
        int counter = 1;
        int sum = 0;
        boolean isPrime;

        while(counter <= 100){
            isPrime = true;
            if(counter == 1){
                isPrime = false;
            } else if(counter == 2){
                isPrime = true;
            } else if(counter%2 != 0){
                for(int i = 3; i < counter; i++){
                    if(counter%i == 0){
                        isPrime = false;
                    }
                }
            } else{
                isPrime = false;
            }
            if(isPrime){
                sum += counter;
            }

            counter++;
        }
        System.out.println("The sum is " + sum);
    }
}