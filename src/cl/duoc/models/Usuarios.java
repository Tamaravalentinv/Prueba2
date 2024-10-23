/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Usuarios {
    private String IdUsuario;
    private String suscripcionUsuarios;
    private String codigoAlfaNumerico;
    private boolean recomendacionPersonalizada;
    private int detallesContenido;
    private int tipoContenido;

    public Usuarios() {
    }

    public Usuarios(String IdUsuario, String suscripcionUsuarios, String codigoAlfaNumerico, boolean recomendacionPersonalizada, int detallesContenido, int tipoContenido) {
        this.IdUsuario = IdUsuario;
        this.suscripcionUsuarios = suscripcionUsuarios;
        this.codigoAlfaNumerico = codigoAlfaNumerico;
        this.recomendacionPersonalizada = recomendacionPersonalizada;
        this.detallesContenido = detallesContenido;
        this.tipoContenido = tipoContenido;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getSuscripcionUsuarios() {
        return suscripcionUsuarios;
    }

    public void setSuscripcionUsuarios(String suscripcionUsuarios) {
        this.suscripcionUsuarios = suscripcionUsuarios;
    }

    public String getCodigoAlfaNumerico() {
        return codigoAlfaNumerico;
    }

    public void setCodigoAlfaNumerico(String codigoAlfaNumerico) {
        this.codigoAlfaNumerico = codigoAlfaNumerico;
    }

    public boolean isRecomendacionPersonalizada() {
        return recomendacionPersonalizada;
    }

    public void setRecomendacionPersonalizada(boolean recomendacionPersonalizada) {
        this.recomendacionPersonalizada = recomendacionPersonalizada;
    }

    public int getDetallesContenido() {
        return detallesContenido;
    }

    public void setDetallesContenido(int detallesContenido) {
        this.detallesContenido = detallesContenido;
    }

    public int getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(int tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "IdUsuario=" + IdUsuario + ", suscripcionUsuarios=" + suscripcionUsuarios + ", codigoAlfaNumerico=" + codigoAlfaNumerico + ", recomendacionPersonalizada=" + recomendacionPersonalizada + ", detallesContenido=" + detallesContenido + ", tipoContenido=" + tipoContenido + '}';
    }

    void getIdUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
