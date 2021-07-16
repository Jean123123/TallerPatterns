/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conpatron.Decorator;

/**
 *
 * @author kenny
 */
public class Camara extends VehiculoDecorator {

    public Camara(IVehiculo v) {
        super(v);
    }

    @Override
    public String getPrestaciones() {
        String nuevo = super.getPrestaciones()+ "Se añadio camara para retro \n";
        return nuevo;
    }
}
