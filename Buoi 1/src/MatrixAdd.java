import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        int i = 0;
        while(i < 3)
        {
            try
            {
                Scanner s = new Scanner(System.in);
                int j = 0;
                while (j < 4) matrix1[i][j++] += s.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Integer only!");
            }
            i++;
        }
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
