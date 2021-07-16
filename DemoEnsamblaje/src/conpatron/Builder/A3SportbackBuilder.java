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
public class A3SportbackBuilder extends VehiculoBuilder {

    public A3SportbackBuilder() {
        vehiculo.tipoCarroceria = new Carroceria();
        vehiculo.tipoCarroceria.tipoCarroceria = "deportivo";
        vehiculo.tipoCarroceria.material = "fibra de carbono";
        vehiculo.tipoCarroceria.habitaculoReforzado = true;
    }

    // --------------------------
    @Override
    public void construirHabitaculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // --------------------------

    @Override
    public void construirMotor() {
        vehiculo.motor = new MotorDiesel();
    }
    // --------------------------

    @Override
    public void definirExtras() {
        vehiculo.direccionAsistida = false;
    }
    // --------------------------

    @Override
    public void definirMarcaModelo() {
        vehiculo = new Vehiculo();
        vehiculo.marca = "Audi";
        vehiculo.modelo = "A3Sportback";
    }

}
