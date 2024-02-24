/**
 * Representa un número fraccionario con un numerador y un denominador.
 * Ejemplo: Numerador = 3, Denominador = 4 representa la fracción 3/4.
 */
public class Fraccionario {
    private int numerador = 3; 
    private int denominador = 4; 

    public Fraccionario() {
        
    }

    // Getters y setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
