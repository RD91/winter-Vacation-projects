import java.util.Scanner;

public class nivennum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check it is niven or not: ");
        int num = input.nextInt(),sum=0,n=num;
        while (num > 0){
            int r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        if (n % sum == 0){
            System.out.println("Your entered number " +n+" is niven");
        }
        else{
            System.out.println("Your entered number " +n+" is not niven");
        }
    }
}
