import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {

        Scanner input = new Scanner(System.in);
        // Display.Interface(); //เเสดงหน้าเครื่องคิดเลข

        Display.InitNum(); 
        double initNum = input.nextDouble() ;
        input.nextLine(); //clear buffer

        Operator operator = new Operator(initNum);

        boolean check = true ;
        //----------loop-------------
        while (check) {
            Display.OperatorList();
            String op_val = input.nextLine() ;
            
            if (op_val.contains("=")) break ; //chek if "="  exit loop
            
            Display.nextNum(); ; //input new number
            double nextNum = input.nextDouble() ;

            operator.calculator(op_val, nextNum);
            input.nextLine(); //clear buffer
        }
        Display.DisplayResult(operator.getResult());
        input.close();
    }
}