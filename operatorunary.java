public class operatorunary {
    public static void main(String[] args){
    // unary = operasi pada satu variable
        int angka = 1;
        System.out.printf("unary -, %d menjadi %d\n",angka,-angka );
        System.out.printf("unary +, %d menjadi %d\n",angka,+angka );

        // unary increment dan decrement
        int angka2 = 1;
        angka2++;
        System.out.println("nilai dengan ++ menjadi =" + angka2);

        int angka3 = 19;
        angka3--;
        System.out.println("nilai dengan -- menjadi =" + angka3);

        int a = 5;
        System.out.printf("nilai dengan ++ prefix menjadi = %d\n", ++a);
        int b = 10;
        System.out.printf("nilai dengan ++ post fix menjadi = %d\n", b++);
        System.out.printf("nilai dari hasil postfix menjadi = %d\n", b);

        // unary boolean ! untuk negasi
        boolean yanto = true;
        System.out.println("nilai boolean =" + yanto);
        System.out.println("nilai boolean =" + !yanto);
    }
    
}
