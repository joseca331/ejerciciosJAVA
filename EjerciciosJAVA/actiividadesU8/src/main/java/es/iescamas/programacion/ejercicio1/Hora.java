package es.iescamas.programacion.ejercicio1;

public class Hora {

    protected int hora;
    protected int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public boolean setHora(int valor) {
        if (valor >= 0 && valor < 24) {
            this.hora = valor;
            return true;
        }
        return false;
    }

    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor < 60) {
            this.minuto = valor;
            return true;
        }
        return false;
    }

    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}
