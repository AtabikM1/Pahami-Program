import java.util.Scanner;

public class recursive {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai = ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukkan nilai = " + nilai );   

        printNilai(nilai);
        //fungsi rekursif sederhana
    }
    
    private static void printNilai(int parameter){
        System.out.println("nilai = "+ parameter);
        if(parameter == 0){
            return;
        }
        parameter--;
        printNilai(parameter);
    }


    
}