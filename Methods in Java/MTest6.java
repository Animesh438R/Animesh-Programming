public class MTest6 {
    void change (String temp)
    {
        System.out.println("Inside change(),temp="+temp);
        temp="XYZ";
        System.out.println("Inside change(),temp after modification="+temp);
    }
    public static void main(String[] args) {
        MTest6 ob=new MTest6();
        String str="PQR";
        System.out.println("Before change(),str="+str);
        ob.change(str);
        System.out.println("After change(),str="+str);
    }
}
