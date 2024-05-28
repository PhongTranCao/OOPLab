import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SortAndAverage {
    public static void main(String[] args) {
            Set<Integer> hs = new HashSet<Integer>();
            while (true)
            {
                try {
                    int i = new Scanner(System.in).nextInt();
                    System.out.println(i);
                    hs.add(i);
                }
                catch (Exception e)
                {
                    System.out.println(hs);
                    double sum = 0;
                    for (Integer i:hs)
                    {
                        sum += i.doubleValue();
                    }
                    System.out.println(sum/hs.size());
                    break;
                }
            }

    }
}
