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
public class Peliculas extends Usuarios{
    private boolean duracionPelicula;
    private double calificacionPelicula;

    public Peliculas() {
    }

    public Peliculas(boolean duracionPelicula, double calificacionPelicula) {
        this.duracionPelicula = duracionPelicula;
        this.calificacionPelicula = calificacionPelicula;
    }

    public Peliculas(boolean duracionPelicula, double calificacionPelicula, String IdUsuario, String suscripcionUsuarios, String codigoAlfaNumerico, boolean recomendacionPersonalizada, int detallesContenido, int tipoContenido) {
        super(IdUsuario, suscripcionUsuarios, codigoAlfaNumerico, recomendacionPersonalizada, detallesContenido, tipoContenido);
        this.duracionPelicula = duracionPelicula;
        this.calificacionPelicula = calificacionPelicula;
    }

    public boolean isDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(boolean duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    public double getCalificacionPelicula() {
        return calificacionPelicula;
    }

    public void setCalificacionPelicula(double calificacionPelicula) {
        this.calificacionPelicula = calificacionPelicula;
    }
    

    public double COSTO_BASE_SUSCRIPCION(){
        double costo = Valor * calificacionPelicula;
        if (calificacionPelicula > 4.5){
            costo*=1.1;
        }
        return costo;
    }
    
    
    
}
