    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camionescargas;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class CamionesCargas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Producto produ1=new Producto('f',44,33);
        Producto produ2=new Producto('f',44,33);
        Producto produ3=new Producto('f',44,33);
        Producto produ4=new Producto('f',44,33);
        Producto produ5=new Producto('f',44,33);
        // carga
        
        ArrayList <Producto> arreglo_cargas = new ArrayList ();
        arreglo_cargas.add(produ1);
        arreglo_cargas.add(produ2);
        arreglo_cargas.add(produ3);
        arreglo_cargas.add(produ4);
        arreglo_cargas.add(produ5);
        // creacion de secto
        Sector sector1 = new Sector (400,350, arreglo_cargas);
        // LISTO
        
        
    }
    
}
