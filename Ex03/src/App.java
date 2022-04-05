import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        double toPay = 0;
        double paid = 0;

        System.out.println("------------------");
        System.out.println("Ubiratan's Store:");
        System.out.println("------------------");
        System.out.print("Amount to pay: > ");
        toPay = input.nextDouble();
        System.out.print("Amount paid: > ");
        paid = input.nextDouble();

        calculateChange(toPay, paid);

    }

    public static void calculateChange(double toPay, double paid) {

        double exchangeToGive = paid - toPay;
        double exchangeAmount = 0;

        double[] bankNote = { 100.00, 50.00, 10.00, 5.00, 1.00, 0.50, 0.10, 0.05, 0.01 };

        for (double n : bankNote) {
            if (exchangeToGive != 0) {
                if (n % exchangeToGive == 0) {
                    exchangeAmount += exchangeToGive / n;
                    exchangeToGive -= exchangeToGive / n;
                }
            }
        }

        System.out.println(exchangeAmount);
    }
}
