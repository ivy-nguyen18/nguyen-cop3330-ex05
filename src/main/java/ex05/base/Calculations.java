package ex05.base;

public class Calculations {
    private int n1;
    private int n2;

    public Calculations(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public int addition(int n1, int n2){
        return n1 + n2;
    }

    public int subtraction(int n1, int n2){
        return n1 - n2;
    }

    public int multiplication(int n1, int n2){
        return n1 * n2;
    }

    public int division(int n1, int n2){
        return n1 / n2;
    }
}
