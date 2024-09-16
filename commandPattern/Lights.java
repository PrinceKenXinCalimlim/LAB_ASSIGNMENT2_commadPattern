public class Lights implements Device {
    
    private int brightness;
    
    public Lights() {
        this.brightness = 0; 
         
    }
    @Override
    public void turnOn() {
        System.out.println("The Lights are Switched On!");
    }
    @Override
    public void turnOff() {
        System.out.println("The Lights are Switched Off!");
    }
    public void adjustBrightness(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Brightness level must be between 0 and 100.");
            return;
        }
        brightness = level;
        System.out.println("Brightness Adjusted to " + level + "!");
    }
}