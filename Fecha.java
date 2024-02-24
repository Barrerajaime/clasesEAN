/**
 * Representa una fecha con año, mes y día.
 * Ejemplo: Año = 2023, Mes = 10, Día = 31 representa la fecha 31 de Octubre de 2023.
 */
public class Fecha {
    private int año = 2023; 
    private int mes = 10; 
    private int día = 31; 

    public Fecha() {
        
    }

    // Getters y setters
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDía() {
        return día;
    }

    public void setDía(int día) {
        this.día = día;
    }

    @Override
    public String toString() {
        return día + "/" + mes + "/" + año;
    }
}
