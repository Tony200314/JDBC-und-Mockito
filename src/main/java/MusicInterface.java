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
                    databasecommand.getER();
                    break;
                case 2:
                    music.Donready();
                    databasecommand.getDonready();
                    break;
                case 3:
                    music.Kieran();
                    databasecommand.getKieran();
                    break;
                case 4:
                    music.Rst();
                    databasecommand.getRst();
                    break;
                case 5:
                    music.AngieRose();
                    databasecommand.getAngieRose();
                    break;
                default:
                    databasecommand.getAllArstist();

            }
        }
    }
}
