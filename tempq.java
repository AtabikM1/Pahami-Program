import java.util.Scanner;

public class tempq{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int array[];
            array = new int[5];

            for (int i= 0; i< array.length; i++){
                System.out.print("masukkan angka = ");
                array [i] = sc.nextInt();
            }
            for (int i = 0; i< array.length; i++){
                System.out.println("array "+i+"dengan elemen"+array[i]);
            }
       
    }
}