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
public class Camion {
    private float volMax;
    private float pesoMax;
    public ArrayList <Sector> mSector;
public Camion(){
    mSector=new ArrayList();
}
    public Camion(float volMax, float pesoMax, ArrayList<Sector> mSector) {
        this.volMax = volMax;
        this.pesoMax = pesoMax;
        mSector=new ArrayList(mSector);
    }





//SETTERS Y GETTERS
    public float getVolMax() {
        return volMax;
    }

    public void setVolMax(float volMax) {
        this.volMax = volMax;
    }

    public float getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(float pesoMax) {
        this.pesoMax = pesoMax;
    }

    public ArrayList<Sector> getmSector() {
        return mSector;
    }

    public void setmSector(ArrayList<Sector> mSector) {
        this.mSector = mSector;
    }
   //METODO
    public boolean bienCargado(){
        boolean resul=false;
        return resul;
    }
}
