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
public class Sector {
   private float volumen;
   private float peso;
   ArrayList<Producto> carga;

    public Sector() {
    }

    public Sector(float volumen, float peso, ArrayList<Producto> carga) {
        this.volumen = volumen;
        this.peso = peso;
        this.carga = carga;
    }
    
    //GETTERS Y SETTERS
   public void setVolumen(float volumen){
       this.volumen=volumen;
   }
    public float getVolumen(){
       return volumen;
   }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public ArrayList<Producto> getCarga() {
        return carga;
    }

    public void setCarga(ArrayList<Producto> carga) {
        this.carga = carga;
    }
    
}
