import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = i; j < line; j++) System.out.print(" ");
            for (int j = 1; j <= 2*(i - 1) + 1; j++) System.out.print("*");
            System.out.println(" ");
        }
    }
}
