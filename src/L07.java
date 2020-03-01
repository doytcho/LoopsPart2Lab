import java.util.Scanner;

public class L07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int minNumber = Integer.MAX_VALUE;
        int number;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scan.nextLine());
            if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println(minNumber);
    }
}
