import java.util.Scanner;
class Parking{
    int vlno,time;
    double bill;
    Parking()
    {
        time=0;
        vlno=0;
        bill=0.0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vehicle no.-");
        vlno=sc.nextInt();
        System.out.println("Enter the time-");
        time=sc.nextInt();
        sc.close();
    }
    void calculate()
    {
        bill=time*3;
        System.out.println("total bill="+bill);
    }
    void display()
    {
        System.out.println("Total time="+time);
        System.out.println("Vehicle no.="+vlno);
    }
    public static void main(String[] args) {
        Parking ob= new Parking();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
