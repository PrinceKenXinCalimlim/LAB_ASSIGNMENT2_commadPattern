public class Thermostat implements Device {

    private double temperature;
    

    public Thermostat() {
        this.temperature = 0; 
              
    }

    @Override
    public void turnOn() {
        System.out.println("The Thermostat is Turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("The Thermostat is Turned Off!");
    }

    public void adjustTemperature(double newTemperature) {
        if (newTemperature < 4 || newTemperature > 32) {
            System.out.println("Temperature must be between 4 and 32 degrees Celsius.");
            return;
        }
        this.temperature = newTemperature;
        System.out.println("Temperature Adjusted to " + newTemperature + " degrees Celsius.");
    }
}