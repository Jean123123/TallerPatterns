/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conpatron.Decorator;

/**
 *
 * @author adria
 */
public final class RadioDecorator implements IVehiculo{
    
    protected IVehiculo vehi;
    
    /**
     *
     * @param vehi
     */
    
    
    public RadioDecorator (IVehiculo vehi){
        this.setVehiculo(vehi);
    }
    public void setVehiculo(IVehiculo vehi){
        this.vehi= vehi;
    }
    public IVehiculo getVentana(){
        return this.vehi;
    }

    @Override
    public String getPrestaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
    
}
