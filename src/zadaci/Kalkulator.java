package zadaci;

public class Kalkulator {

// POLJA ili attributes ili properties
    private double operand1;
    private double operand2;
// KONSTRUKTOR
    public Kalkulator(double operand1, double operand2) {

        // FUNKCIJA ZBRAJANJA,ODUZIMANJA,DJELJENJA,MNOZENJA
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() {
        return operand1 + operand2;
    }

    public double sub() {
        return operand1 - operand2;
    }

    public double mul() {
        return operand1 * operand2;
    }

    public double div() {
        return operand1 / operand2;
    }

}
