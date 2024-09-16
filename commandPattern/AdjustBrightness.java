public class AdjustBrightness implements Command {
    private Lights lights;
    private int brightnessLevel;

    public AdjustBrightness(Lights lights, int brightnessLevel) {
        this.lights = lights;
        this.brightnessLevel = brightnessLevel;
    }
    
    @Override
    public void execute() {
        lights.adjustBrightness(brightnessLevel);
    }
}