import java.util.Scanner;

public class alphabetpatten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows you want?");
        int row = input.nextInt();
        System.out.println("Here is your output!");
        for (int i=0;i<=row;i++){
            for (int j=0;j<=i;j++){
                System.out.print(((char) (65+j)+" ")); //for printing ABCD in capital and 65 denotes capital A in ASCII number set
            }
            System.out.println(); //for new line
        }
    }
}
