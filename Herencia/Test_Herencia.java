package Tarea6Herencia;

/*No� Jonat�n G�mez Hern�ndez 
CARNE: 7690-20-16812
INGENIERIA EN SISTEMAS
SECCION: " A" */

import java.util.Scanner;

public class Test_Herencia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              
        System.out.println("Por favor Ingrese un numero:");
        int x = in.nextInt();
        
        System.out.println("Ingrese un segundo numero por favor");
        int y = in.nextInt();
        
        SubclaseHerencia subClase = new SubclaseHerencia(x, y);
        
        System.out.println(subClase.getX() + " + " + subClase.getY() + " = " + subClase.sumar());
        
    }
}
