public class AdjustTemperature implements Command {
    private Thermostat thermostat;
    private double newTemperature;

    public AdjustTemperature(Thermostat thermostat, double newTemperature) {
        this.thermostat = thermostat;
        this.newTemperature = newTemperature;
    }

    @Override
    public void execute() {
        thermostat.adjustTemperature(newTemperature);
    }
}