import java.util.Scanner;

public class phonecallbill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum,num,counter = 0;
        System.out.print("Enter phone call duration in minutes: ");
        num = input.nextDouble();
        if (num>1 && num<=5){
            sum = num;
            System.out.println("The amount for "+num+" minutes call = " + sum +" Rs");
        }
        else if(num > 5 && num <= 10){
            double n = 5;
            for (int i = 0;i < num;i++){
                if (n + i == num){
                    counter = i;
                }
            }
            sum = (counter*1.5)+n;
            System.out.println("The amount for "+num+" minutes call = " + sum +" Rs");
        }
        else if (num > 10 && num <=20){
            double n = 10;
            for (int i =0;i< num ; i++){
                if (n + i == num) {
                    counter = i;
                }
            }
            sum = (counter * 2.0) + 12.5;
            System.out.println("The amount for "+num+" minutes call = " + sum +" Rs");
        }
        else if (num > 20 && num <=30){
            double n = 20;
            for (int i =0;i< num ; i++){
                if (n + i == num) {
                    counter = i;
                }
            }
            sum = (counter * 3.0) + 32.5;
            System.out.println("The amount for "+num+" minutes call = " + sum +" Rs");
        }
        else if (num > 30){
            double n = 30;
            for (int i =0;i< num ; i++){
                if (n + i == num) {
                    counter = i;
                }
            }
            sum = (counter * 4.0) + 62.5;
            System.out.println("The amount for "+num+" minutes call = " + sum +" Rs");
        }

    }
}
