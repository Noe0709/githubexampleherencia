package Tarea6Herencia;

/*Noé Jonatán Gómez Hernández 
CARNE: 7690-20-16812
INGENIERIA EN SISTEMAS
SECCION: " A" */

public class Superclase_Herencia {
    
    private int x;
    private int y;
    private int z;

    public Superclase_Herencia(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getA() {
        return x;
    }

    public int getB() {
        return y;
    }

    public int getC() {
        return z;
    }
    
    public int sumar(){
        z=x+y;
        return z;
    } 
}

