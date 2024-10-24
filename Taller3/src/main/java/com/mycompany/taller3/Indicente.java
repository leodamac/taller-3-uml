/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ricky
 */
public class Indicente {
    
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String Descripcion;
    protected List<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    
    public Usuario responsable;
    public PersonalAcademico beneficiario;

 
    
}
