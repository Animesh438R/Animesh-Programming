import java.util.Scanner;
public class Matrix2d {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int[][] darr= new int[3][3];
        int i,j;
        System.out.println("Enter the values in 2d array-");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                darr[i][j]= scr.nextInt();
            }
        }
        System.out.println("The entered elements are=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(darr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
