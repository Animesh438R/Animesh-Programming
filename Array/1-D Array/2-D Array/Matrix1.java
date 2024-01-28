import java.util.Scanner;
public class Matrix1 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int[][] darr1= new int[3][3];
        int[][] darr2= new int[3][3];
        int[][] darr3= new int[3][3];
        int i,j;
        
        System.out.println("Enter the first 2d array-");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                darr1[i][j]= scr.nextInt();
            }
        }
        System.out.println("Enter the second 2d array-");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                darr2[i][j]= scr.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                darr3[i][j]= darr2[i][j]-darr1[i][j];
            }
        }
        System.out.println("The resultant array=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(darr3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
