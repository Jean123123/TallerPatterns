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
public class Sensor extends VehiculoDecorator {

    public Sensor(IVehiculo v) {
        super(v);
    }

    @Override
    public String getPrestaciones() {
        String nuevo = super.getPrestaciones()+ "Se añadio sistema de sensores para retro \n";
        return nuevo;
    }
}
