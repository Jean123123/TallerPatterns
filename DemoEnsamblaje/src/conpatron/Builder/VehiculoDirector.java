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
public class VehiculoDirector {

    private Vehiculo vehiculo;
    
    public VehiculoDirector() {}
    // --------------------------
    
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    // --------------------------
     public void contruirVehiculo( VehiculoBuilder builder )
    {
        builder.construirHabitaculo();
        builder.construirMotor();
        builder.construirRuedas();
        builder.definirExtras();
        builder.definirMarcaModelo();
    }
    
}
