import java.sql.*;

public class Databaseconnect {
    private static Connection connection;
    private static String url = "jdbc:sqlite:C:\\Funtocode\\SQLLItemusic\\tonysqlitedatabase.db";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection(url);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("SQLite JDBC-Treiber nicht gefunden!");
                e.printStackTrace();
            }
        }
        return connection;
    }
}
        // Treiber laden (optional, aber empfohlen)
       /*

        // Abrufen der Daten
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("Fehler beim Zugriff auf die Datenbank!");
            e.printStackTrace();
        } finally {
            System.out.println("JDBC operation finished.");
        }

       /* try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()){
            String creatTable= "CREATE TABLE IF NOT EXIST Arstist(" +
                    "Name Text not null" +
                    "ArtistId Integer not null" +
                    "Land Text not null" +
                    "Gender Text not null" +
                    ")";
            statement.executeUpdate(creatTable);
        }catch (SQLException e) {
            System.out.println("Table created");
        }

        // Neue Verbindung für Datenbank-Änderungen (Insert)
        try (Connection create = DriverManager.getConnection(url);
             Statement stmt = create.createStatement()) {

            // Daten in die "author"-Tabelle einfügen
            String insertSQL = "INSERT INTO author (id, first_name, last_name) VALUES (3, 'William', 'Shakespeare')";
            int rowsInserted = stmt.executeUpdate(insertSQL);
            System.out.println(rowsInserted + " Zeilen eingefügt.");



        } catch (SQLException e) {
            System.out.println("Fehler beim Einfügen in die Datenbank!");
            e.printStackTrace();
        }*/





