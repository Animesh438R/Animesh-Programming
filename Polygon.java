public class Polygon {
    double area(double a, double b, double c)
    {
        double s= (a+b+c)/2;
        double ar= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    }
    double area(int a, int b, int h)
    {
        double ar1=((a+b)*h)/2;
        return ar1;
    }
    double area(double d1, double d2)
    {
        double ar2=(d1*d2)/2;
        return ar2;
    }
    public static void main(String[] args) {
        Polygon ob= new Polygon();
        double x= ob.area(4, 6, 8);
        double y= ob.area(5, 7, 9);
        double z=ob.area(3, 8);
        System.out.println("Area of the triangle="+x);
        System.out.println("Area of the trapezium="+y);
        System.out.println("Area of the Rhombus="+z);
    }
}
