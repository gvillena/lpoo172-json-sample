/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.sample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giancarlo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Creando Objeto Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Creando objetoEjemplo de clase ClaseEjemplo
        ClaseEjemplo objetoEjemplo = new ClaseEjemplo();
        
        // Asignando valores
        objetoEjemplo.setFoo("foo");
        objetoEjemplo.setBaz(951);
        objetoEjemplo.setXzc(753.45);        
        
        // Convirtiendo objetoEjemplo en formato JSON
        String json = gson.toJson(objetoEjemplo);
        System.out.println(json);        
                
        try {
            // Guardando en archivo (*.txt)            
            FileWriter writer = new FileWriter(new File("d://json.txt"));
            writer.append(json);            
            writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
                
    }
    
}
