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
public class Documentales extends Usuarios{
    private String enfoqueEducativo;
    private int duracionMinutos;

    public Documentales() {
    }

    public Documentales(String enfoqueEducativo, int duracionMinutos) {
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracionMinutos = duracionMinutos;
    }

    public Documentales(String enfoqueEducativo, int duracionMinutos, String IdUsuario, String suscripcionUsuarios, String codigoAlfaNumerico, boolean recomendacionPersonalizada, int detallesContenido, int tipoContenido) {
        super(IdUsuario, suscripcionUsuarios, codigoAlfaNumerico, recomendacionPersonalizada, detallesContenido, tipoContenido);
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracionMinutos = duracionMinutos;
    }

    public String getEnfoqueEducativo() {
        return enfoqueEducativo;
    }

    public void setEnfoqueEducativo(String enfoqueEducativo) {
        this.enfoqueEducativo = enfoqueEducativo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public double COSTO_BASE_SUSCRIPCION(){
        double costo = Valor * duracionMinutos;
        if (duracionMinutos > 90){
            costo*= 0.95;
            
        }
        return costo;
    }

 
}
