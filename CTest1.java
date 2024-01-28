public class CTest1 {
    static int l;
    static int b;
    CTest1(){
        l=8;
        b=5;
    }
    public static void main(String[] args) {
        CTest1 ob= new CTest1();
        int ar=l*b;
        System.out.println("Area of the rectangle="+ar);
    }
}
