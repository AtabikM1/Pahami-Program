public class fungsiormethod {

    public static void main(String[] args){
        int y,x;

        x = 5;
        y = hitung(x);

        System.out.println("y = " + y + " x = " + x);

    }
    static int hitung (int input) {
        int hasil;

        hasil = input * input + 10;

        return hasil;

    }
}