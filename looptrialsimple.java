import java.util.Scanner;

public class looptrialsimple {

    public static void main(String[] args){
        //program jumlah rentang atau s(n)
        int action1, action2, total;
        boolean condition = true;
        
        Scanner inputuser = new Scanner(System.in);
        System.out.println("masukkan nilai awal");
        action1 = inputuser.nextInt();
        System.out.println("masukkan nilai akhir");
        action2 = inputuser.nextInt();

        total = 0;
        
        while (action1 <= action2) {
            total = total + action1;
            System.out.println(" addign "+ action1 + " be "+ total);
            action1++;
            
        }

        //do while loop:
        do{
            total+= action1;
            if(action1>=action2){
            condition = false;
            }
            action1++;
            while (condition){
        }        
            
        
    }
}