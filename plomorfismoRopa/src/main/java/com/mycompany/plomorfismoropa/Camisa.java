
package com.mycompany.plomorfismoropa;

/**
 *
 * @author Isabella Solarte
 */
public class Camisa extends Ropa{


    private String disenio;
    private String tipoManga;

   public Camisa(String diseño, String tipoManga, String marca, String talla, String material) {
        super(marca, talla, material);
        this.disenio = diseño;
        this.tipoManga = tipoManga;
    }
    //getters
    public String getDiseño() {
        return disenio;
    }

    public String getTipoManga() {
        return tipoManga;
    }
    //setters
    public void setDiseño(String diseño) {
        this.disenio = diseño;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+ "\n Talla: "+talla+"\n Material: "+material+"\n Disenio: "+disenio+"\n Tipo de manga: "+tipoManga;
    }
}
