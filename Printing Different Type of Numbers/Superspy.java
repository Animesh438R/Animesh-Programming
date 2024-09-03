import java.util.Scanner;
public class Superspy {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int num=0,sum=0,count=0,d,temp;
        System.out.println("Enter a no.-");
        num=scr.nextInt();
        temp=num;
        
        while(temp>0)
        {
            d=temp%10;
            sum=sum+d;
            temp=temp/10;         
            count= count +1;
        }
        if(sum==count)
        {
            System.out.println("The no. is a super spy no.");
        }
        else{
            System.out.println("The no. is not a super spy no.");
        }
        scr.close();
    }
    
}

