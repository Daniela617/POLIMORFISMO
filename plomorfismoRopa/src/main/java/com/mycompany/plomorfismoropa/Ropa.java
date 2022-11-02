
package com.mycompany.plomorfismoropa;
/**
 *
 * @author Isabella Solarte
 */
public class Ropa {     

   protected String marca;
   protected String talla;
   protected String material;
   //constructor
    public Ropa(String marca, String talla, String material) {
        this.marca = marca;
        this.talla = talla;
        this.material = material;
    }
    //getters
     public String getMarca() {
        return marca;
    }

    public String getTalla() {
        return talla;
    }

    public String getMaterial() {
        return material;
    }

    //setters
      public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String mostrarDatos(){
    
        return "Marca: "+marca+ "\n Talla: "+talla+"\n Material: "+material;
    
    }
}
