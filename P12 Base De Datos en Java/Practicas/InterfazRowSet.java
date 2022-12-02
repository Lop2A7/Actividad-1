package interfazrowset;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import javax.sql.RowSetEvent; 
import javax.sql.RowSetListener; 
import javax.sql.rowset.JdbcRowSet; 
import javax.sql.rowset.RowSetProvider; 
public class InterfazRowSet {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Creating and Executing RowSet 
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/sonoo");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        rowSet.setCommand("select * from personas");
        rowSet.execute();

        while (rowSet.next()) {
            // Generating cursor Moved event 
            System.out.println("DNI: " + rowSet.getString(1));
            System.out.println("Nombre: " + rowSet.getString(2));
            System.out.println("Edad: " + rowSet.getString(3));
        }
    }
}
