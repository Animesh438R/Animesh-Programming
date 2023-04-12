public class Text2 {
    int volume_cuboid(int l,int b,int h)
    {
        int vol=l*b*h;
        return vol;
    }    
    public static void main(String[] args) {
        Text2 ob=new Text2();
        int x=ob.volume_cuboid(4, 8, 12);
        System.out.println("Volume of cuboid="+x);
    }
}
