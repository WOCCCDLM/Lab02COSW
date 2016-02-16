/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.spademo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.cosw.spademo.Stub;
import edu.eci.cosw.spademo.ServicioI;
import edu.eci.cosw.spademo.Tarea;

/**
 *
 * @author 2086906
 */
@RestController
@RequestMapping("/tareas")
public class TareasRest {
    
    @Autowired
    private ServicioI servicios;
    
    
    
    @RequestMapping(method = RequestMethod.GET)
    public  List<Tarea>getTareas(){
        return servicios.getTareas();
    }
    
    
    
    
    
    /*@RequestMapping(method = RequestMethod.POST)
    public void addTareas(@RequestBody Tarea tarea){
        return tareas;
    } */  
    
}
