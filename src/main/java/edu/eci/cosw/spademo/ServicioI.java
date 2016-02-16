/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.spademo;

import java.util.ArrayList;

/**
 *
 * @author 2086906
 */
public interface ServicioI {
    public void addTarea(Tarea tarea);
    public ArrayList<Tarea> getTareas();
    
}
