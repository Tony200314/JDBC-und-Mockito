import java.sql.SQLException;
import java.util.Scanner;

public class MusicInterface {

    public void playMusic() throws SQLException{
        Databasecommand databasecommand = new Databasecommand();
        Music music = new Music();

        System.out.println("Enter the name of the music: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice = sc.nextInt(5);
            switch (choice) {
                case 1:
                    music.ER();
                    databasecommand.getArtist("E.R");
                    break;
                case 2:
                    music.Donready();
                    databasecommand.getArtist("Don Ready");
                    break;
                case 3:
                    music.Kieran();
                    databasecommand.getArtist("Kieran");
                    break;
                case 4:
                    music.Rst();
                    databasecommand.getArtist("Rst");
                    break;
                case 5:
                    music.AngieRose();
                    databasecommand.getArtist("Angie Rose");
                    break;
                default:
                    databasecommand.getAllArtist();

            }
        }
    }
}
