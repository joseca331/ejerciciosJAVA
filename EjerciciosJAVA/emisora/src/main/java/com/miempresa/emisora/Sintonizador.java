package com.miempresa.emisora;


public class Sintonizador {

    private double frecuencia;
    private final double MAX_FRECUENCIA = 80.0;
    private final double MIN_FRECUENCIA = 50.0;
    private final double SALTO = 0.5;

    public Sintonizador() {
    	super();
    	
    	frecuencia = MAX_FRECUENCIA; 
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double up() {

        if (frecuencia + SALTO > MAX_FRECUENCIA) {
            frecuencia = MIN_FRECUENCIA;
        } else {
            frecuencia += SALTO;
        }

        return frecuencia;
    }

    public double down() {

        if (frecuencia - SALTO < MIN_FRECUENCIA) {
            frecuencia = MAX_FRECUENCIA;
        } else {
            frecuencia -= SALTO;
        }

        return frecuencia;
    }
}

	


