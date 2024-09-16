public class SwitchPlaylist implements Command{
    private MusicPlayer musicPlayer;

    public SwitchPlaylist(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.switchPlaylist();
    }  
}