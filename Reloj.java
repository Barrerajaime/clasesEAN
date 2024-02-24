/**
 * Representa un reloj con horas, minutos y segundos.
 * Ejemplo: Hora = 14, Minutos = 30, Segundos = 45 representa la hora 14:30:45.
 */
public class Reloj {
    private int hora = 14; // Ejemplo inventado
    private int minutos = 30; // Ejemplo inventado
    private int segundos = 45; // Ejemplo inventado

    public Reloj() {
        
    }

    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
