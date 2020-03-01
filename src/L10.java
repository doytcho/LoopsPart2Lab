import java.util.Scanner;

public class L10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenght = Integer.parseInt(scan.nextLine());
        int winght = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int volume = lenght * height * winght;
        int count = 0;
        String imput = scan.nextLine();
        while (!imput.equals("Done")) {
            count = Integer.parseInt(imput);
            volume -= count;
            if (volume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
                break;
            }
            imput = scan.nextLine();
        }
        if (volume > 0) {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
