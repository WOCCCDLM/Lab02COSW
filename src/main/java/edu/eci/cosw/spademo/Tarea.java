/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.spademo;

import java.util.logging.Logger;

/**
 *
 * @author 2086906
 */
public class Tarea{
    private String descripcion;
    private int prioridad;

              
    public Tarea(String desc, int prio){
         descripcion = desc;
         prioridad = prio;
    }
         
         
    public String getDescripcion() {
       return descripcion;
    }
    
     public int getPrioridad() {
        return prioridad;
    }
         
      public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
         
}
