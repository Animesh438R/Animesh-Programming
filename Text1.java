public class Text1 {
   double area_circle(int r) 
   {
    double ar=3.14*r*r;
    return ar;
   }
   public static void main(String[] args) {
    Text1 ob=new Text1();
    double x=ob.area_circle(5);
    System.out.println("Area of circle="+x);
   }
}
