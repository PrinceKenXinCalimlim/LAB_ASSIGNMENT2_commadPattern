public class MusicPlayer implements Device {

    private static String songTitle = "Eyeless by Slipknot";
    private static String songPlaylist = "Heavy Metal Playlist 6";

    @Override
    public void turnOn() {
        System.out.println("The Music Player is Switched On!"+" "+"Now Listening to:"+" "+songTitle);
    }

    @Override
    public void turnOff() {
        System.out.println("The Music Player is Switched Off!");
    }

    public void switchPlaylist() {
        System.out.println("Switched to: "+" "+songPlaylist);
    }
}