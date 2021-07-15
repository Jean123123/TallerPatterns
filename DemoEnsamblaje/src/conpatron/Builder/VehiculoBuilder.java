/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conpatron.Builder;

import sinpatron.Vehiculo;

/**
 *
 * @author adria
 */
public abstract class VehiculoBuilder {
    
    protected Vehiculo vehiculo;
    // ------------------------------
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    // ------------------------------
     public void crearNuevoVehiculo() {
        this.vehiculo = new Vehiculo();
    }
    // ------------------------------------
    // Métodos que deberán ser construídos por las clases que hereden de ésta
     public abstract void construirHabitaculo();
     public abstract void construirMotor();
     public abstract void construirRuedas();
     public abstract void definirExtras();
     public abstract void definirMarcaModelo();

    
}
