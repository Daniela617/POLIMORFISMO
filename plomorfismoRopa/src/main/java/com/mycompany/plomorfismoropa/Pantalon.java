
package com.mycompany.plomorfismoropa;

/**
 *
 * @author Isabella Solarte
 */
public class Pantalon extends Ropa {

    private String tipoTiro;
    private String TipoBota;

    public Pantalon(String tipoTiro, String TipoBota, String marca, String talla, String material) {
        super(marca, talla, material);
        this.tipoTiro = tipoTiro;
        this.TipoBota = TipoBota;
    }
    //getters
    public String getTipoTiro() {
        return tipoTiro;
    }

    public String getTipoBota() {
        return TipoBota;
    }
    //setters
     public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }
    public void setTipoBota(String TipoBota) {
        this.TipoBota = TipoBota;
    }
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+ "\n Talla: "+talla+"\n Material: "+material+"\nTiro: "+tipoTiro+"\n Bota: "+TipoBota;
    }
}
