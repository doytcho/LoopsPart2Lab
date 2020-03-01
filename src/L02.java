import java.util.Scanner;

public class L02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();
        String text = scan.nextLine();
        while (!text.equals(password)) {
            text = scan.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
