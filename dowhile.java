public class dowhile {
    public static void main(String[] args){
        /*do {
         *  action
          while (kondisi)*/

          System.out.println("action 1");

          int a = 0;
          boolean condition = true;

          do {
            a--;
            System.out.println(" do while " + a);

            if (a==1) {
                condition = false;
            }
            
         }while(condition);
            System.out.println("ini adalah akhir program");
          
          
    }
}
