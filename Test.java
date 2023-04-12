public class Test {
    void area_rectangle(int l,int b)
    {
        int ar=l*b;
        System.out.println("area of rectangle ="+ar);
    }
    public static void main(String[] args) {
        Test ob=new Test();
        ob.area_rectangle(4, 8);
    }
}
