/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagnostic;

import diagnostic.Enums.Categoria;
import diagnostic.Enums.Destinos;

/**
 *
 * @author CESAR
 */
public class Viaje {

    private int folio;
    private Destinos destino;
    private Categoria categoria;
    private boolean discount;

    public Viaje(int edad, Destinos carrera, Categoria anio, boolean isRegular) {
        this.folio = edad;
        this.destino = carrera;
        this.categoria = anio;
        this.discount = isRegular;
    }

    public Viaje() {
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isRegular() {
        return discount;
    }

    public void setRegular(boolean isRegular) {
        this.discount = isRegular;
    }
}
