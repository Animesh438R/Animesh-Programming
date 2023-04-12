public class Test2 {
    void volume_cuboid(int l,int b,int h)
    {
        int vol=l*b*h;
        System.out.println("Volume of cuboid="+vol);
    }
    public static void main(String[] args) {
        Test2 ob=new Test2();
        ob.volume_cuboid(2, 4, 6);
    }
}
