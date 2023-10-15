import java.util.Scanner;

public class switchcase {
    public static void main(String [] args){
        String input;
        Scanner inputuser = new Scanner(System.in);

        System.out.println("input data");
        input = inputuser.next();
            //eksprsi bisa berupa int, long, byte, short,
        switch(input){
            case "red":
            System.out.println(" red was the color of ferarri");
                break;
            case "green":
            System.out.println("green was the color of kawasaki");
                break;
            case "yellow":
            System.out.println("yellow was a lambo symbol");
            default:
                System.out.println("others");


        }
        System.out.println("program is done");
    }
    
}