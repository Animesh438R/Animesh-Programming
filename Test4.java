public class Test4 {
    void change(int x)
    {
        x=x+6;
        System.out.println("Inside change(),x="+x);
    }
    public static void main(String[] args) {
        Test4 ob = new Test4();
        int a = 44;
        System.out.println("Before change(),a="+a);
        ob.change(a);
        System.out.println("After change(),a="+a);
    }
}
