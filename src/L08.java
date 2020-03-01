import java.util.Scanner;

public class L08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int n = 1;
        double sum = 0;
        double number;
        while (n <= 12) {
            number = Double.parseDouble(scan.nextLine());
            if (number >= 4) {
                sum += number;
                n++;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, (sum / 12.0));

    }
}
