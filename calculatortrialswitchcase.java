import java.util.Scanner;

public class calculatortrialswitchcase {
    public static void main(String [] args){
        Scanner inputuser;
        float a, b, hasil;
        String operator;

        inputuser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputuser.nextFloat();
        System.out.print("operator = ");
        operator = inputuser.next();
        System.out.print("nilai b = 6");
        b = inputuser.nextFloat();

        switch(operator){
            case "+":
                hasil = a + b;
                System.out.print("hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.print("hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.print("hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.print("hasil = " + hasil);
                break;
            default:
                System.out.print("operator " + operator + " tidak  ditemukan");
        }
    }
}
