/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

/**
 *
 * @author CltControl
 */
public class PersonalAcademico extends Usuario {
    protected boolean reportarError(String email, String contenido){
        return true;
    }
    
    protected boolean solicitarAsesoramientoDelSistema(String email, String contenido){
        return true;
    }
    
    protected boolean comentarEnForo(Foro foro, String comentario){
        return true;
    }
}
