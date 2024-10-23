/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

/**
 *
 * @author CltControl
 */
public class Estudiante extends PersonalAcademico {
    protected boolean solicitarInscripcionCurso(Curso curso){
        return true;
    }
    
    protected boolean realizarActividadesSumativa(Curso curso, ActividadSumativa actividadSumativa){
        return true;
    }
}
