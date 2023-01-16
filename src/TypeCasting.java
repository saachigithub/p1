public class TypeCasting {
    public static void main(String[] args) {
        float a=2.3f;
        long b=10;
        long r= (long) (a+b);
        System.out.println(r);

        int aa=128;
        byte bb=(byte)aa;
        System.out.println(bb);

        byte c=9;
        byte d=8;
        int res=c+d;
        System.out.println(res);
    }
}
