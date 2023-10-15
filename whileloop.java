public class whileloop {

    public static void main(String [] args){
        // nilai awal
        int a = 0;
        boolean condition = true;
            //prpint awal
        System.out.println("action 1");

        while (condition){
            System.out.println(" start - " + a);
            
            ++a;
            if (a == 5){
                condition = false;
            } 

        
        
        }
            System.out.println("done program ");
    }
}