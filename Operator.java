class Operator {
    private double Result;
    private double Temp;

    public Operator(double firstNumber) {
        this.Result = 0;       
        this.Temp = firstNumber; 
    }

    public void calculator(String Operator, double secondNumber) {
        switch (Operator) { //121+232+2-4-15*12+8 % 5
            case "+":
                this.Result += this.Temp;
                this.Temp = secondNumber;
                break;

            case "-":
                this.Result += this.Temp;
                this.Temp = -secondNumber; 
                break;

            case "*":
                this.Temp = this.Temp * secondNumber;
                break;

            case "/":
                this.Temp = this.Temp / secondNumber;
                break;

            case "%":
                this.Temp = this.Temp % secondNumber;
                break;

            default:
                System.out.println("Invalid operator");
        }
    }

    public double Result() {
        this.Result += this.Temp;
        return this.Result;
    }
    
}