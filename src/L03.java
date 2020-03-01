import java.util.Scanner;

public class L03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String imput = scan.nextLine();
        int sum = 0;
        while (!imput.equals("Stop")) {
            sum += Integer.parseInt(imput);
            imput = scan.nextLine();
        }
        System.out.println(sum);
    }
}
