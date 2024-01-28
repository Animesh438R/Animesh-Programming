public class MOTest4 {
    double area(double a,double b,double c)
    {
        double s=(a+b+c)/2;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    }
    double area(int a,int b,int h)
    {
        double ar=(h*(a+b))/2;
        return ar;
    }
    double area(double d1,double d2)
    {
        double ar=(d1*d2)/2;
        return ar;
    }
    public static void main(String[] args) {
        MOTest4 ob=new MOTest4();
        double x=ob.area(2.7, 4.6, 5.2);
        System.out.println("Area of the scalene triangle="+x);
        double y=ob.area(4, 5, 7);
        System.out.println("Area of the trapezium="+y);
        double z=ob.area(6, 4);
        System.out.println("Area of the rhombus="+z);
    }
}
    

