import java.util.Scanner;

public class primeOrnot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prime = 0;
        System.out.println("Enter any number to see it prime or composite");
        int user = input.nextInt();
        int half = user/2;
        if (user == 0 || user == 1){
            System.out.println("It is not prime nor composite");
            prime = 1;
        }
        else {
            for(int i=2;i<=half;i++){
                if (user % i == 0){
                    System.out.println("Composite number");
                    prime = 1;
                    break;
                }
            }
        }
        if (prime == 0){
            System.out.println("Prime number");
        }


    }
}
