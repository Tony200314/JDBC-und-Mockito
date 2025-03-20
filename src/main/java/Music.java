import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Music {
    private static File file;
    private  static Scanner scanner = new Scanner(System.in);

    public static void ER() {
        file = new File("src/main/E.R. - Maranatha (prod. by Pridefighta) [Official Video] (64) (1).wav");
       try {
           System.out.println("Play= S  Stop song = E");
            String command = scanner.nextLine();
            AudioInputStream audioSystem = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioSystem);
            if (command=="S") clip.start();
            if (command=="E") clip.stop();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        }

    }

    public static void Donready() {
        file = new File("src/main/Don Ready _ 7_34AM (Official Video) (64) (1).wav");
        try {
            System.out.println("Play= S  Stop song = E");
            String command = scanner.nextLine();
            AudioInputStream audioSytem = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioSytem);
           if(command=="S") clip.start();
           if (command=="E") clip.stop();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }

    }

    public static void Kieran() {
        file = new File("src/main/no_pride_feat._tierra_ducote_mp3_61428.wav");
        try {
            System.out.println("Play= S  Stop song = E");
            String command = scanner.nextLine();
            AudioInputStream audioSystem = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioSystem);
          if(command== "S")  clip.start();
           if (command=="E")clip.stop();
           if(command=="D") clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Rst() {
        file = new File("src/main/rst_1plike4christ_clip_officiel_mp3_61341.wav");

        try {
            System.out.println("Play= S  Stop song = E");
            String command = scanner.nextLine();
            AudioInputStream audioSystem = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioSystem);
            if(command == "S")clip.start();
            if (command =="E")clip.stop();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        }

    }

    public static void AngieRose() {
        String command = scanner.nextLine();
        try {
            System.out.println("Play= S  Stop song = E");
            file = new File("src/main/oh_yhwh_mp3_61385.wav");
            AudioInputStream audioSystem = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioSystem);
           if(command == "S") clip.start();
            if(command== "E")clip.stop();
        } catch (LineUnavailableException | UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
