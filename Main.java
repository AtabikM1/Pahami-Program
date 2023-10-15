public class Main {

    public static void main(String[] args){
        System.out.println("hello world");
        // membuat variable int
        int a = 10;
        System.out.println("===INTEGER===");
        System.out.println("nilai a =" + a);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("besar integer = " + Integer.BYTES +"bytes");
        System.out.println("ukuran integer = " + Integer.SIZE +"bit");

        // membuat variable byte
        byte b = 10;
        System.out.println("===BYTES===");
        System.out.println("nilai a =" + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES +"bytes");
        System.out.println("ukuran byte = " + Byte.SIZE +"bit");

        // membuat variable short
        short s = 10;
        System.out.println("===BYTES===");
        System.out.println("nilai s =" + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("besar Short = " + Short.BYTES +"Shorts");
        System.out.println("ukuran Short = " + Short.SIZE +"bit");

         // membuat variable long
        long l = 10L;
        System.out.println("===LONG===");
        System.out.println("nilai Long =" + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("besar Long = " + Long.BYTES +"bytes");
        System.out.println("ukuran Long = " + Long.SIZE +"bit");

         // membuat variable double
        double d = 10.5;
        System.out.println("===DOUBLE===");
        System.out.println("nilai d =" + d);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("besar Double = " + Double.BYTES +"bytes");
        System.out.println("ukuran Double = " + Double.SIZE +"bit");

        //membuat variable float
        float f = 10.5f;
        System.out.println("===Float===");
        System.out.println("nilai f =" + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("besar Float = " + Float.BYTES +"bytes");
        System.out.println("ukuran Float = " + Float.SIZE +"bit");

        //membuat variable char (koma, bilangan asli) berdasarkan ASCII
        char c = 'c';
        System.out.println("===CHARACTER===");
        System.out.println("nilai char =" + c);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("besar Character = " + Character.BYTES +"bytes");
        System.out.println("ukuran Character = " + Character.SIZE +"bit");
        
        int x = 5;
        int y = 7;
        System.out.println(x&y);
    }
}