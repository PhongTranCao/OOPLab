import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = s.nextLine();
        System.out.println("Age?");
        int age = s.nextInt();
        System.out.println("Height?");
        double height = s.nextDouble();

        System.out.println("Mr/Mrs " + name + ", " + age + " years old, " + height + " m");
    }
}
