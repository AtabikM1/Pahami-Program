public class loopingbersarang {
    public static void main(String [] args){
        //looping bersarang
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" j ");
            }System.out.print("\n");
        }
        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" # ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");


        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" # ");
                if((i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");

        }System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" # ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        


        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" # ");
                if((i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");

            //sama saja namun lebih simpel

        }System.out.print("\n");
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(" # ");
                if((i+j)==8){
                    break;

                }else if(i==j){
                    break;
                }
            }
            System.out.print("\n");

        }
    }
}
//