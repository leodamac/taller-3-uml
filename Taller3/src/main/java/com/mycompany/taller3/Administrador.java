/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

/**
 *
 * @author CltControl
 */
public class Administrador extends Usuario{
    protected Usuario crearUsuarioConRol(String usuario, String contraseña){
        Usuario user = new Usuario();
        return user;
    }
    
    protected boolean asignarPermiso(String usuario){
        return true;
    }
    
    protected boolean actualizarSoftware(){
        return true;
    }
    
    protected boolean asignarResponsable(Curso curso, Profesor responsable){
        return true;
    }
    
}
