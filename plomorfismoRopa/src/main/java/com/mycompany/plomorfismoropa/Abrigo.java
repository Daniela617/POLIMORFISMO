
package com.mycompany.plomorfismoropa;

/**
 *
 * @author Isabella Solarte
 */
public class Abrigo extends Ropa{

    private String tipoCierre;
    private String capucha;
    
    public Abrigo(String tipoCierre, String capucha, String marca, String talla, String material) {
        super(marca, talla, material);
        this.tipoCierre = tipoCierre;
        this.capucha = capucha;
    }
    //getters
     public String getTipoCierre() {
        return tipoCierre;
    }

    public String getCapucha() {
        return capucha;
    }
    
    //setters
    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    public void setCapucha(String capucha) {
        this.capucha = capucha;
    }
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+ "\n Talla: "+talla+"\n Material: "+material+"\n Tipo de cierre: "+tipoCierre+"\n Tipo de capucha: "+capucha;
    }
}
