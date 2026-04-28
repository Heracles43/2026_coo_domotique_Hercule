import thermos.Thermostat;


public class ThermostatAdapter implements Appareil {

    
    private Thermostat thermostat;

    public ThermostatAdapter(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

   
    public void allumer() {
        this.thermostat.monterTemperature();
    }

  
    public void eteindre() {
        this.thermostat.baisserTemperature();
    }


    public String toString() {
        return this.thermostat.toString();
    }
}
