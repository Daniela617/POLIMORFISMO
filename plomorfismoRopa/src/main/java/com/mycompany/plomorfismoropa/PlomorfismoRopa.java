
package com.mycompany.plomorfismoropa;

/**
 *
 * @author Isabella Solarte
 */
public class PlomorfismoRopa {

    public static void main(String[] args) {
        
        Ropa miRopa[] = new Ropa[4];
        
        miRopa[0] = new Ropa("Studio F","M","Algodon");
        miRopa[1] = new Pantalon("Alto","Ancha","Zara","XS","Mezclilla");
        miRopa[2] = new Camisa("Infantil","Corta","Studio F","S","Seda");
        miRopa[3] = new Abrigo("Botones","Con capucha","True","XL","Algodon");
        
        for (Ropa ropa:miRopa){
            System.out.println(ropa.mostrarDatos());
            System.out.println(" ");
        }
    }
}
