import java.util.Scanner;

public class L05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double total = 0;
        double income = 0;
        for (int i = 0; i < n; i++) {
            income = Double.parseDouble(scan.nextLine());
            if (income >= 0.0) {
                total += income;
                System.out.printf("Increase: %.2f%n", income);
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }

        System.out.printf("Total: %.2f%n", total);

    }
}
