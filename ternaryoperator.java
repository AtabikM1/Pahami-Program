import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args){
        int input, x;
        Scanner inputUser= new Scanner(System.in);

        System.out.println("masukkan nilai");
        input= inputUser.nextInt();
        //variable = expresi ? statement true : statement false
        x = (input == 10) ? (input*input) : (input/2);

        System.out.println("hasil" + x);
    }
}
