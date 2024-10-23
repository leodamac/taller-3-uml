/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class Curso {
    private List estudiantesEnEsperaDeInscripcion;
    private List estudiantesInscritos;
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<ActividadSumativa> actividadesSumativas;
    private List<Foro> foros;
    
    public boolean inscribirEstudiante(Estudiante estudiante){
        estudiantesInscritos.add(estudiante);
        return true;
    }
    
    public boolean agregarEstudianteEnEspera(Estudiante estudiante){
        estudiantesEnEsperaDeInscripcion.add(estudiante);
        return true;
    }
    
    public void crearTarea(String titulo, DataTime fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, DataTime fechaDePublicacion){
        ActividadSumativa as = new Tarea();
        actividadesSumativas.add(as);
    }
    
    public void crearEvaluacion(String titulo, DataTime fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, int limiteDeTiempo){
        ActividadSumativa as = new Evaluacion();
        actividadesSumativas.add(as);
    }            
    
}
