import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestArtist {
    @Mock
    private Connection mockConnection;
    @Mock
    private Statement mockStatement;
    @Mock
    private ResultSet mockResultSet;

    private Databasecommand databasecommand;

    @Before
    public void setUp() throws SQLException {
        MockitoAnnotations.openMocks(this);
        databasecommand = new Databasecommand();

        when(mockConnection.createStatement()).thenReturn(mockStatement);
    }

    @Test
    public void testGetER() throws SQLException {
        when(mockStatement.executeQuery("select * from artist where name ='E.R'")).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getString("ArtistId")).thenReturn("1");
        when(mockResultSet.getString("Name")).thenReturn("E.R");
        when(mockResultSet.getString("Land")).thenReturn("Germany");
        when(mockResultSet.getString("Gender")).thenReturn("M");

        databasecommand.getER();

        verify(mockStatement).executeQuery("select * from artist where name ='E.R'");
        verify(mockResultSet, times(1)).next();
    }

    @Test
    public void testGetDonReady() throws SQLException {
        when(mockStatement.executeQuery("select * from artist where name ='Don Ready'")).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getString("ArtistId")).thenReturn("2");
        when(mockResultSet.getString("Name")).thenReturn("Don Ready");
        when(mockResultSet.getString("Land")).thenReturn("USA");
        when(mockResultSet.getString("Gender")).thenReturn("M");

        databasecommand.getDonready();

        verify(mockStatement).executeQuery("select * from artist where name ='Don Ready'");
        verify(mockResultSet, times(1)).next();
    }

    @Test
    public void testGetKieran() throws SQLException {
        when(mockStatement.executeQuery("select * from artist where name ='Kieran the Light'")).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getString("ArtistId")).thenReturn("3");
        when(mockResultSet.getString("Name")).thenReturn("Kieran the Light");
        when(mockResultSet.getString("Land")).thenReturn("USA");
        when(mockResultSet.getString("Gender")).thenReturn("M");

        databasecommand.getKieran();

        verify(mockStatement).executeQuery("select * from artist where name ='Kieran the Light'");
        verify(mockResultSet, times(1)).next();
    }

    @Test
    public void testGetRst() throws SQLException {
        when(mockStatement.executeQuery("select * from artist where name ='Rst'")).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getString("ArtistId")).thenReturn("4");
        when(mockResultSet.getString("Name")).thenReturn("Rst");
        when(mockResultSet.getString("Land")).thenReturn("UK");
        when(mockResultSet.getString("Gender")).thenReturn("M");

        databasecommand.getRst();

        verify(mockStatement).executeQuery("select * from artist where name ='Rst'");
        verify(mockResultSet, times(1)).next();
    }

    @Test
    public void testGetAngieRose() throws SQLException {
        when(mockStatement.executeQuery("select * from artist where name ='Angie Rose'")).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getString("ArtistId")).thenReturn("5");
        when(mockResultSet.getString("Name")).thenReturn("Angie Rose");
        when(mockResultSet.getString("Land")).thenReturn("USA");
        when(mockResultSet.getString("Gender")).thenReturn("F");

        databasecommand.getAngieRose();

        verify(mockStatement).executeQuery("select * from artist where name ='Angie Rose'");
        verify(mockResultSet, times(1)).next();
    }

    @Test
    public void testGetAllArtists() throws SQLException {
        when(mockStatement.executeQuery("select * from artist where name ='Don Ready'")).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getString("ArtistId")).thenReturn("6");
        when(mockResultSet.getString("Name")).thenReturn("Don Ready");
        when(mockResultSet.getString("Land")).thenReturn("USA");
        when(mockResultSet.getString("Gender")).thenReturn("M");

        databasecommand.getAllArstist();

        verify(mockStatement).executeQuery("select * from artist where name ='Don Ready'");
        verify(mockResultSet, times(1)).next();
    }
}
