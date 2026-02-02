package Code_java ;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        try {
            String textcal = input.nextLine() ;
            Calculator cal = new Calculator(textcal) ;
            cal.getresult() ;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() ) ;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() ) ;
        } catch (Exception e) {
            System.out.println("Error : Something went wrong") ;
        } finally {
            input.close() ;
        }

    }
}