import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.-");
        int x=sc.nextInt();
        int sum=0;
        int digit,temp,cbn;
        temp=x;
        while(x>0)
        {
            digit=x%10;
            cbn=digit*digit*digit;
            sum=sum+cbn;
            x=x/10;
        }
        if(sum==temp)
        {
            System.out.println("No. is armstrong");    
        }
        else
        {
            System.out.println("Not a armstrong no.");
        }  
        sc.close();
    }
}
