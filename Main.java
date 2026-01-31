import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {

        Scanner input = new Scanner(System.in);
        
        Display.Welcome(); //เเสดงหน้าเครื่องคิดเลข
        double initNum = input.nextDouble() ;
        input.nextLine(); //clear buffer

        boolean check = true ;
        //----------loop-------------
        while (check) {
            Display.Interface();
            String op_val = input.nextLine() ;
            
            if (op_val.contains("=")) break ; //chek if "="  exit loop
            
            System.out.print("Enter next number: ") ; //input new number
            double nextNum = input.nextDouble() ;
            input.nextLine(); //clear buffer
            
        }
        
        input.close();
    }
}