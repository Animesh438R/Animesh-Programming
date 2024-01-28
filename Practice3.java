import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,temp,sum=0,prod=1,d;
        System.out.println("Enter the Number-");
        num=sc.nextInt();
        temp=num;

        while(temp>0)
        {
            d=temp%10;
            sum=sum+d;
            prod=prod*d;
            temp=temp/10;
        }
        if(sum==prod){
            System.out.println("the no. is a spy no.");     
        }
        else{
            System.out.println("the no. is not a spy no.");
        }
        sc.close();
    }
}
