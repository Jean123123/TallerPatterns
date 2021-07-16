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

    private VehiculoBuilder builder;
    
    public VehiculoDirector(VehiculoBuilder builder) {
        this.builder=builder;
    }
    
    public Vehiculo getVehiculo() {
        return builder.getVehiculo();
    }
    // --------------------------
     public void contruirVehiculo( VehiculoBuilder builder )
    {
        builder.definirMarcaModelo();
        builder.construirHabitaculo();
        builder.construirMotor();
        builder.definirExtras();
    }
    
}
