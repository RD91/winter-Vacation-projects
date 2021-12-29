import java.util.Scanner;

public class numberSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a two number swap program.\nPlease enter the first number: ");
        int x = input.nextInt();
        System.out.println("Please Enter the Second number: ");
        int y = input.nextInt();
        System.out.println("Your number before swapping x="+x+" y="+y);
        x = x+y; y = x-y; x = x-y;
        System.out.println("Your number after swapping x="+x+" y="+y);
    }
}
