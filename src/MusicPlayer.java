import javax.sound.sampled.*;
import java.io.*;

public class MusicPlayer {
    public static void main(String[] args) {
        playMusic("C:\\Users\\shady\\IdeaProjects\\creating a game\\Super Mario Bros. Theme Song.mp3"); // Replace "music.wav" with the path to your audio file
    }

    public static void playMusic(String filePath) {
        try {
            File musicFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);

            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);

            audioClip.start();

            // You can uncomment the following line if you want the music to loop
            // audioClip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
}
