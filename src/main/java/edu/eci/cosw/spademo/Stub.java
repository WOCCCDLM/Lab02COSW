    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.spademo;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2086906
 */
@Service
public class Stub implements ServicioI {
    
    private ArrayList<Tarea> tareas; 
    
       
    @Override
    public void addTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
    
}
