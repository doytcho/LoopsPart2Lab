import java.util.Scanner;

public class L09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int n = 1;
        boolean flag = false;
        double sum = 0;
        double number;
        while (n <= 12) {
            number = Double.parseDouble(scan.nextLine());
            if (number >= 4) {
                sum += number;
                flag = false;
                n++;
            } else {
                if (flag) {
                    System.out.printf("%s has been excluded at %d grade", name, n);
                    break;
                }
                flag = true;
            }
        }
        if (!flag) System.out.printf("%s graduated. Average grade: %.2f", name, (sum / 12.0));

    }
}
