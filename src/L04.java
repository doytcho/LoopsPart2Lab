import java.util.Scanner;

public class L04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i = i * 2 + 1) {
            System.out.println(i);
        }

    }
}
