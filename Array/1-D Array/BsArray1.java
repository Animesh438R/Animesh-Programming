import java.util.Scanner;
public class BsArray1 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        char[] ch= new char[5];
        int start,last,mid;
        char i,item='A';
        boolean found= false;
        System.out.println("Enter an array of 5 character elements-");
        for(i=0;i<=(ch.length-1);i++)
        {
            ch[i]=scr.next().charAt(0);
        }     
        start=0;
        last=ch.length-1;
        mid=(start+last)/2;
        while(found==false && start<=last)
        {
            if(item==ch[mid])
            {
                found=true;
            }
            else if(item>ch[mid])
            {
                start=mid+1;
            }
            else
            {
                start=mid-1;
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
