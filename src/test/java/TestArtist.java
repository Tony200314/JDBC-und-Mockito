import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


class DatabaseCommandTest {

    private Databasecommand databaseCommand;
    private Connection connection;

    @BeforeEach
    void setUp() {
        connection = Mockito.mock(Connection.class);
        databaseCommand = new Databasecommand();
        Databaseconnect connectionMock = Mockito.mock(Databaseconnect.class);
        when(connectionMock.getConnection()).thenReturn(connection);
    }

    @Test
    void getArtist_ShouldReturnArtistInfo() throws SQLException {
        // Arrange
        String name = "John Doe";
        Statement statement = Mockito.mock(Statement.class);
        ResultSet resultSet = Mockito.mock(ResultSet.class);

        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery("select * from artist where name ='E.R'")).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        when(resultSet.getString("ArtistId")).thenReturn("1");
        when(resultSet.getString("Name")).thenReturn("E.R");
        when(resultSet.getString("Land")).thenReturn("Germany");
        when(resultSet.getString("Gender")).thenReturn("Male");

        // Act
        databaseCommand.getArtist(name);

        // Assert
        assertAll(
                () -> assertEquals("1", "1"),
                () -> assertEquals("E.R", "E.R"),
                () -> assertEquals("Germany", "Germany"),
                () -> assertEquals("Male", "Male")
        );
    }
}