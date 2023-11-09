import java.util.Scanner;

public class trialfunctioncalculatedraw {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputpanjang = sc.nextInt();
        System.out.print("lebar = ");
        int inputlebar = sc.nextInt();

        gambar(inputpanjang, inputlebar);

        System.out.println("luas = " + luas(inputpanjang, inputlebar));
        System.out.println("keliling = " +keliling(inputpanjang, inputlebar));

        tampilkankellilingdanluas(inputpanjang, inputlebar);

    }

    private static void tampilkankellilingdanluas(int panjang, int lebar){
        System.out.println("luas  = "+ luas(panjang, lebar));
        System.out.println("keliling = "+ keliling(panjang, lebar));
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < 0; j++){
                System.out.println("X ");
            }
            System.out.print("\n");
        }
    }
}
