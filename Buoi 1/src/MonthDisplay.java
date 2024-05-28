import java.util.Scanner;

public class MonthDisplay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try
        {
            int month = s.nextInt();
            int year = s.nextInt();
            if (month > 12 || month < 0) throw new Exception();
            if (year % 4 == 0 && month == 2) System.out.println(29);
            else switch (month)
            {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(31);
                case 2:
                    System.out.println(28);
                default:
                    System.out.println(30);
            }
        }catch (Exception e)
        {
            System.out.println("Invalid month or year!");
        }
    }
}
