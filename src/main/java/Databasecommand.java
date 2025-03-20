import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databasecommand {
    private static Connection connection;

    public Databasecommand() {
        this.connection = Databaseconnect.getConnection();
    }

    public void getER(){
        String sql = "select * from artist where name ='E.R'";
        try (Statement stmt = connection.createStatement();
             ResultSet rst = stmt.executeQuery(sql)){
             while (rst.next()){
                 System.out.println("ArtistId: "+rst.getString("ArtistId")+" ArtistName: "+ rst.getString("Name")
                     + " LAND: " + rst.getString("Land") + " Gender: "+ rst.getString("Gender"));
             }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void getDonready(){
        String sql = "select * from artist where name ='Don Ready'";
        try (Statement stmt = connection.createStatement();
             ResultSet rst = stmt.executeQuery(sql)){
            while (rst.next()){
                System.out.println("ArtistId: "+rst.getString("ArtistId")+" ArtistName: "+ rst.getString("Name")
                        + " LAND: " + rst.getString("Land") + " Gender: "+ rst.getString("Gender"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void getKieran(){
        String sql = "select * from artist where name ='Kieran the Light'";
        try (Statement stmt = connection.createStatement();
             ResultSet rst = stmt.executeQuery(sql)){
            while (rst.next()){
                System.out.println("ArtistId: "+rst.getString("ArtistId")+" ArtistName: "+ rst.getString("Name")
                        + " LAND: " + rst.getString("Land") + " Gender: "+ rst.getString("Gender"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void getRst(){
        String sql = "select * from artist where name ='Rst'";
        try (Statement stmt = connection.createStatement();
             ResultSet rst = stmt.executeQuery(sql)){
            while (rst.next()){
                System.out.println("ArtistId: "+rst.getString("ArtistId")+" ArtistName: "+ rst.getString("Name")
                        + " LAND: " + rst.getString("Land") + " Gender: "+ rst.getString("Gender"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void getAngieRose(){
        String sql = "select * from artist where name ='Angie Rose'";
        try (Statement stmt = connection.createStatement();
             ResultSet rst = stmt.executeQuery(sql)){
            while (rst.next()){
                System.out.println("ArtistId: "+rst.getString("ArtistId")+" ArtistName: "+ rst.getString("Name")
                        + " LAND: " + rst.getString("Land") + " Gender: "+ rst.getString("Gender"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void getAllArstist(){
        String sql = "select * from artist where name ='Don Ready'";
        try (Statement stmt = connection.createStatement();
             ResultSet rst = stmt.executeQuery(sql)){
            while (rst.next()){
                System.out.println("ArtistId: "+rst.getString("ArtistId")+" ArtistName: "+ rst.getString("Name")
                        + " LAND: " + rst.getString("Land") + " Gender: "+ rst.getString("Gender"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
