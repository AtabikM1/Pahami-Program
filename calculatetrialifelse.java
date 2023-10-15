import java.util.Scanner;

public class calculatetrialifelse{
    public static void main(String[] args){
        //a operator b 
        Scanner inputuser;
        float a, b, hasil;
        char operator;

        inputuser = new Scanner(System.in);
        
        System.out.print("a = ");
        a = inputuser.nextFloat();
        System.out.print("opeator = ");
        operator = inputuser.next().charAt(0);
        System.out.print("b = ");
        b = inputuser.nextFloat();

        System.out.println("input user = "+ a +  " "+operator+" "+ b);
        
        //pengoprasian dengan if else

        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            if ( b == 0){
                System.out.println("infiniti numbers");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);}
        } else {
            System.out.println("operator not found");
        }
        
    }
}
