public class Method{
    int volume(int l,int b,int h)
    {
        int vol=l*b*h;
        return vol;
    }
    public static void main(String[] args) {
        Method ob=new Method();
        int x=ob.volume(8, 6, 4);
        System.out.println("Volume of the cuboid="+x);
    }   
}