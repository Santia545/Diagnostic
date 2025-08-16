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
    private String cliente;

    public Viaje(int edad, Destinos carrera, Categoria anio, boolean isRegular, String cliente) {
        this.folio = edad;
        this.destino = carrera;
        this.categoria = anio;
        this.discount = isRegular;
        this.cliente = cliente;
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

    public boolean isDiscounted() {
        return discount;
    }

    public void setDiscount(boolean isRegular) {
        this.discount = isRegular;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
