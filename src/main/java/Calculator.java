public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addNums(){
        return this.num1 + this.num2;
    }

    public int subtractNums(){
        return this.num1 - this.num2;
    }

    public int multiplyNums(){
        return this.num1 * this.num2;
    }

    public int divideNums(){
        return this.num1 / this.num2;
    }
    
}
