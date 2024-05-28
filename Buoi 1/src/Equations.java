import java.util.Scanner;

public class Equations {
    public static void firstDegree (double a, double b)
    {
        if (a == 0)
        {
            if (b == 0) System.out.println("Infinite solution");
            else System.out.println("No solution");
        }
        else System.out.println((double)-b/a);
    }
    public static void linearSystem(double a11, double a12, double b1, double a21, double a22, double b2)
    {
        double d = a11 * a22 - a12 * a21,
                d1 = b1 * a22 - b2 * a21,
                d2 = b1 * a12 - b2 * a11;
        if (a11/a12 == a21/a22)
        {
            if (a11/a12 == b1/b2) System.out.println("Infinite solution");
            else System.out.println("No solution");
        }
        else System.out.println(d2/d + " " + d1/d);
    }
    public static void secondDegree (double a, double b, double c)
    {
        if (a == 0) firstDegree(b, c);
        else
        {
            double delta = b*b - 4*a*c;
            if (delta < 0) System.out.println("No solution");
            else if (delta == 0) System.out.println(-b/(2*a));
            else System.out.println((delta - b)/(2 * a) + " " + (-delta - b)/(2 * a));
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true)
        {
            System.out.println("Choose case:");
            switch (s.nextInt())
            {
                case 1:
                {
                    firstDegree(s.nextDouble(), s.nextDouble());
                    continue;
                }
                case 2:
                {
                    linearSystem(s.nextDouble(), s.nextDouble(), s.nextDouble(),
                            s.nextDouble(), s.nextDouble(), s.nextDouble());
                    continue;
                }
                case 3:
                {
                    secondDegree(s.nextDouble(), s.nextDouble(), s.nextDouble());
                    continue;
                }
                default:
                    return;
            }
        }
    }
}
