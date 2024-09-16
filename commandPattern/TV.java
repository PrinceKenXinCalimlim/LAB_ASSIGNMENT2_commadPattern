public class TV implements Device {
   
    @Override
    public void turnOn() {
        System.out.println("Tv is Turned-on!"); 
    }
    
    @Override
    public void turnOff(){
        System.out.println("Tv is Turned-off");
    }


public class TurnOn implements Command{
    private Device device;

    public TurnOn(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
}