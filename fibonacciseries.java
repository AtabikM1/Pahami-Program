import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args){
        // calculate value fibonacci series
        int f_n, f_n_1, f_n_2, n;

        Scanner inputuser = new Scanner(System.in);
        System.out.println(" take a value - ");
        n = inputuser.nextInt();

        f_n_2 = 1;
        f_n_1 = 1;
        f_n = 1;

        for(int i = 1; i <= n; i++ ){
            System.out.println("value = "+ i +" is " + f_n);
            f_n = f_n_2 + f_n_1;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
    }
}