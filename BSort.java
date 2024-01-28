import java.util.Scanner;
public class BSort {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int[] arr= new int[10];
        int i,j,len,temp;
        len=arr.length;
        System.out.println("Enter the array of 10 integer elements-");
        for(i=0;i<len;i++)
        {
            arr[i]=scr.nextInt();
        }

        for(i=0;i<len-1;i++)
        {
            for(j=0;j<len-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
        scr.close();
    }
}
