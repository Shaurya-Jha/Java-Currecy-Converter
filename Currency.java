import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String args[]){
        System.out.println('1. Rupee');
        System.out.println('2. Dollar');
        System.out.println('3. Euro');

        // take input
        Scanner sc = new Scanner(System.in);

        // take currency as input
        System.out.println("Choose the currency: ");

        int choice = sc.nextInt();
        System.out.println("Enter the amount: ");

        double amount = sc.nextDouble();

        // convert the amount
        switch(choice){
            case 1:
                Rupee_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice")
        }
    }

public static void Rupee_to_other(double amt){
    System.out.println("1 Rupee = " + 0.013 + " Dollar");
    System.out.println();
}

}