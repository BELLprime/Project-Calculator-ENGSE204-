public class Operator {

    private double Result;

    public Operator(double firstNumber) { //Construct
        this.Result = firstNumber;
    }

    public void calculator(String Operator ,double secondNumber) { //method Calculate

        switch (Operator) {

            case "+": //case บวก 
                this.Result = this.Result + secondNumber;
                break;

            case "-": // case ลบ
                this.Result = this.Result - secondNumber;
                break;

            case "*": // case คูณ
                this.Result = this.Result * secondNumber;
                break;

            case "/":// case หาร 

                this.Result = this.Result / secondNumber;
                break;

            case "%": // case มอด 
                this.Result = this.Result % secondNumber;
                break;

            default: // กรอกตัวอื่น
                System.out.println("Invalid operator");
        }
    }

    public double getResult() {
        return this.Result;
    }
}