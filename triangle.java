import java.util.Scanner;


public class triangle {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the last value: ");
        int lastN = sc.nextInt();
    
        for (int cols = 1; cols <=lastN; cols++ ){
            for (int rows = 0; rows < lastN-cols; rows++){
                System.out.print(" r ");
            }
            for (int i = 0; i < cols; i++){
                System.out.print(" c ");
            }   
        System.out.println(" 1 ");
        }
        
             
        for (int cols = 1; cols <= lastN; cols++){
            for (int rows = 0; rows < lastN - cols; rows++){ 
                System.out.print("r");
            }
            for (int i = 0; i <cols; i++){
                System.out.print(" c");
            }
        System.out.println(" 1");
        }

        for (int cols = 0; cols <= lastN; cols++){
            for (int rows = 1; rows < cols + 1; rows++){
                System.out.print(" r ");
            }
            for (int i = lastN; i>cols; i--){
                System.out.print(" c " );
            
            }
            System.out.println();
        }



    }
}
