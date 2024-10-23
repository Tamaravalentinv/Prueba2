/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import static cl.duoc.models.Icalcular.COSTO_BASE_SUSCRIPCION.Valor;

/**
 *
 * @author Cetecom
 */
public class Series extends Usuarios {
    private int numeroTemporadas;
    private boolean temporadaFinalizada;

    public Series() {
    }

    public Series(int numeroTemporadas, boolean temporadaFinalizada) {
        this.numeroTemporadas = numeroTemporadas;
        this.temporadaFinalizada = temporadaFinalizada;
    }

    public Series(int numeroTemporadas, boolean temporadaFinalizada, String IdUsuario, String suscripcionUsuarios, String codigoAlfaNumerico, boolean recomendacionPersonalizada, int detallesContenido, int tipoContenido) {
        super(IdUsuario, suscripcionUsuarios, codigoAlfaNumerico, recomendacionPersonalizada, detallesContenido, tipoContenido);
        this.numeroTemporadas = numeroTemporadas;
        this.temporadaFinalizada = temporadaFinalizada;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isTemporadaFinalizada() {
        return temporadaFinalizada;
    }

    public void setTemporadaFinalizada(boolean temporadaFinalizada) {
        this.temporadaFinalizada = temporadaFinalizada;
    }

    public double COSTO_BASE_SUSCRIPCION(){
        double costo = Valor * numeroTemporadas;
        if (numeroTemporadas > 3){
            costo*=1.05;
        }
        return costo;
    }
    

}