/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public interface Icalcular {
    interface COSTO_BASE_SUSCRIPCION{
        double Valor = 12000;
        double calcularCosto (int mensual);
    }
}
