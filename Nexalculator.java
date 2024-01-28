import java.util.Scanner;
class Nexalculator 
{
    void calculate_sum(int a,int b)
    {
        int sum;
        
        sum = a + b;
        
        System.out.println("Sum of the entered digits="+sum);
        
    }
    
    void calculate_diff(int c,double d)
    {
        double diff;
        
        diff = c - d;
        
        System.out.println("Difference of the entered values="+diff);
        
    }
    
    void calculate_pro(double e,int f)
    {
        double pro;
        
        pro = e* f;
        
        System.out.println("Product of the entered values="+pro);
    }
    
    void calculate_quo(double g,double h)
    {
        double quo;
        
        quo =g/h;
        
        System.out.println("Quotient of the entered values="+quo);
    
    }
    
    public static void main(String[] args)
    {
        Nexalculator user = new Nexalculator();
        
        Scanner scr=new Scanner(System.in);
        
        int k;
        
        System.out.println("Welcome to ADVANCED JAVA Calculator");
        System.out.println("Select your requirement as per the choices provided below:");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        k=scr.nextInt();
        
        switch(k)
        {
            case 1: System.out.println("Enter the first number");
                    int l=scr.nextInt();
                    System.out.println("Enter the number which is to be added to the first number");
                    int m=scr.nextInt();
                    
                    user.calculate_sum(l,m);
                    
                    break;
                    
            case 2:System.out.println("Enter the first number");
                   int n=scr.nextInt();
                   System.out.println("Enter the number to be substracted from the number");
                   int o=scr.nextInt();
                   
                   user.calculate_diff(n,o);
                   
                   break;
                   
            case 3: System.out.println("Enter the first number");
                    int p=scr.nextInt();
                    System.out.println("Enter the number to be multiplied to the first number");
                    int q=scr.nextInt();
                    
                    user.calculate_pro(p,q);
                    
                    
                    break;
                   
            case 4: System.out.println("Enter the first number");
                    int r=scr.nextInt();
                    System.out.println("Enter the number to be divided by the first number");
                    int s=scr.nextInt();
                    
                    user.calculate_quo(r,s);
                    
                    break;
                    
                    default: System.out.println("Looks like you have made a wrong choice!!!Run the program again to restart and use the calculator");
                    
        }
        
        System.out.println("Thank you for using the program");
        scr.close();
    }

}