
import java.util.Scanner;

public class CentralHub {
    public static void main(String[] args) {
        Lights lights = new Lights();
        Thermostat thermos = new Thermostat();
        MusicPlayer mp = new MusicPlayer();
        TV tv = new TV();
        Control control = new Control();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println(" ");

            System.out.println("1. Lights");
            System.out.println("2. Thermostat");
            System.out.println("3. Music Player");
            System.out.println("4. Television");
            System.out.println("5. Exit");
            System.out.print("Select a device to control: ");

            int option = input.nextInt();
            int controlOption;

            switch (option) {
                case 1:
                    System.out.println("\nLIGHTS CONTROLS");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Adjust Brightness");
                    System.out.print("Select Control: ");

                    controlOption = input.nextInt();

                    switch (controlOption) {
                        case 1:
                            control.setCommand(new TurnOn(lights));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(lights));
                            control.select();
                            break;
                        case 3:
                            System.out.print("Enter brightness level (0-100): ");
                            int level = input.nextInt();
                            control.setCommand(new AdjustBrightness(lights, level));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nTHERMOSTAT CONTROLS");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Adjust Temperature");
                    System.out.print("Select Control: ");

                    controlOption = input.nextInt();

                    switch (controlOption) {
                        case 1:
                            control.setCommand(new TurnOn(thermos));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(thermos));
                            control.select();
                            break;
                        case 3:
                            System.out.print("Enter new temperature (4-32 Celsius): ");
                            double temp = input.nextDouble();
                            control.setCommand(new AdjustTemperature(thermos, temp));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\nMUSIC PLAYER CONTROLS");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Change Playlist");
                    System.out.print("Select Control: ");

                    controlOption = input.nextInt();

                    switch (controlOption) {
                        case 1:
                            control.setCommand(new TurnOn(mp));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(mp));
                            control.select();
                            break;
                        case 3:
                            control.setCommand(new SwitchPlaylist(mp));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("\nTELEVISION CONTROLS");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.print("Select Control: ");

                    controlOption = input.nextInt();

                    switch (controlOption) {
                        case 1:
                            control.setCommand(new TurnOn(tv));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(tv));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Terminating the Program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please select a valid option.");
                    break;
            }
        }
    }
}