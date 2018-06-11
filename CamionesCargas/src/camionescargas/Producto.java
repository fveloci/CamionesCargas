
package camionescargas;

public class Producto {
    private char tipo;
    private float volumenUnidad;
    private float pesoUnidad;

    public Producto() {// CONSTRUCTOR POR DEFECTO
    }

    public Producto(char tipo, float volumenUnidad, float pesoUnidad) {//CONSTRUCTOR
        this.tipo = tipo;
        this.volumenUnidad = volumenUnidad;
        this.pesoUnidad = pesoUnidad;
    }
// GETTERS AND SETTERS
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getVolumenUnidad() {
        return volumenUnidad;
    }

    public void setVolumenUnidad(float volumenUnidad) {
        this.volumenUnidad = volumenUnidad;
    }

    public float getPesoUnidad() {
        return pesoUnidad;
    }

    public void setPesoUnidad(float pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }
// FIN GETTERS AND SETTERS    
    public void ubicateEn ( Camion unCamion){
        
    }
    public boolean rechazadoDelCamion(){
        boolean resul;
        
        
        return resul;
    }
}
