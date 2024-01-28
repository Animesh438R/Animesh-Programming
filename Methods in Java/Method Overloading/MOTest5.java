public class MOTest5
{
    void area(int b,int h)
    {
        double ar=(1*b*h)/2;
        System.out.println("Area of the triangle="+ar);
    }
    void perimeter(int a, int b, int c)
    {
        int p= a+b+c;
        System.out.println("Perimeter of the triangle="+p);
    }
    public static void main(String[] args) {
        MOTest5 ob= new MOTest5();
        ob.area(6,8);
        ob.perimeter(3, 8, 5);
    }
}