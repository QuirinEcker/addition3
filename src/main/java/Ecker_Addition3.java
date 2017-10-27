import java.util.Scanner;

public class Ecker_Addition3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Geben Sie x ein: ");
        x = scanner.nextInt();

        System.out.print("Geben Sie y ein: ");
        y = scanner.nextInt();

        final int ERGEBNIS = x + y;


        System.out.printf("%5d \n" , x);
        System.out.printf("%+5d \n" , y);
        System.out.println("-----");
        System.out.printf("%5d" , ERGEBNIS );


    }
}
