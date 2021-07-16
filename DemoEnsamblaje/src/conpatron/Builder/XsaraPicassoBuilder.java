/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conpatron.Builder;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

/**
 *
 * @author adria
 */
public class XsaraPicassoBuilder extends VehiculoBuilder{

    @Override
    public void construirHabitaculo() {
        vehiculo.tipoCarroceria= new Carroceria();
        vehiculo.tipoCarroceria.tipoCarroceria="monovolumen";
        vehiculo.tipoCarroceria.material="acero";
        vehiculo.tipoCarroceria.habitaculoReforzado=false;
    }
    // --------------------------

    @Override
    public void construirMotor() {
        vehiculo.motor= new MotorDiesel();
    }
    // --------------------------

    @Override
    public void definirExtras() {
        vehiculo.direccionAsistida=false;
        
    }
    // --------------------------

    @Override
    public void definirMarcaModelo() {
        vehiculo = new Vehiculo();
        vehiculo.marca= "Citroen";
        vehiculo.modelo= "XsaraPicasso";
        
    }
    
}
