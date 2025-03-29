import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databasecommand {
    private static Connection connection;

    public Databasecommand() {
        this.connection = Databaseconnect.getConnection();
    }

    public void getArtist(String name) {
        String sql = "select * from artist where name ='" + name + "'";
        try (Statement statement = connection.createStatement();
             ResultSet rst = statement.executeQuery(sql)) {
            while (rst.next()) {
                System.out.println("ArtistId: " + rst.getString("ArtistId") + " ArtistName: " + rst.getString("Name")
                        + " LAND: " + rst.getString("Land") + " Gender: " + rst.getString("Gender"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getAllArtist(){
        String sql = "select * from artist";
        try (Statement statement = connection.createStatement();
             ResultSet rst = statement.executeQuery(sql)) {
            while (rst.next()) {
                System.out.println("ArtistId: " + rst.getString("ArtistId") + " ArtistName: " + rst.getString("Name")
                        + " LAND: " + rst.getString("Land") + " Gender: " + rst.getString("Gender"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}


