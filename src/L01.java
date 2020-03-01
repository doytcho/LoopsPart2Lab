import java.util.Scanner;

public class L01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        while (!text.equals("stop")) {
            text = scan.nextLine();
        }
    }
}
