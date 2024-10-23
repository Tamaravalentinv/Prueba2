/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import static cl.duoc.models.Icalcular.COSTO_BASE_SUSCRIPCION.Valor;
import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class RegistroUsuarios extends Usuarios{
    private final ArrayList<Usuarios> usuarios;
    private double costoTotal;
    
    public RegistroUsuarios(){
        usuarios = new ArrayList();
    
    }

    public boolean agregarUsuario(Usuarios usuario){
        for (Usuarios c : usuarios){
           if(getIdUsuario()(usuario.getIdUsuarios()));
               System.out.println("El Id de usuario"+ getIdUsuarios() + "ya esta registrado");
               return false;
            }   
        }
    
    usuario.add(Idusuario);
    System.out.println("Usuario"+ usuarios.getNombre+ "registrado");
    return true;


        }

    public void listarUsuarios(){
        System.out.println("Lista usuarios completada");
        for(Usuarios Usuarios : usuarios){
            usuarios.mostrardatos();

            
        }
    public int contarUsuario(){
        return usuarios;
        }

      }
        public double COSTO_BASE_SUSCRIPCION(int CostoTotal){
        if (CostoTotal = 12000){
        }
        return costoTotal;
        }
      
    }

  

