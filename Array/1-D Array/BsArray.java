import java.util.Scanner;
public class BsArray {
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int[] arr= new int[10];
        int i,mid,start,last,item=25;
        boolean found = false;
        System.out.println("Enter 10 integer array elements in sorted manner");
        for(i=0;i<=(arr.length-1);i++)
        {
            arr[i]= scr.nextInt();
        }
        start= 0;
        last=arr.length-1;
        mid=(start+last)/2;
        
        while(found==false && start<=last)
        {
            if(item==arr[mid])
            {
                found=true;
            }
            else
            {
                start=mid+1;
            }
            mid=(start+last)/2;
            if(found==true)
            {
                System.out.println("Search successful");
            }
            else
            {
                System.out.println("Search unsuccessful");
            }
            
        }
        scr.close();
    }
}

