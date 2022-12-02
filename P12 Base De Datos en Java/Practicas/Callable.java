package callablestatement;
import java.sql.*; 

public class Callable {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/sonoo", "root", "root");

            CallableStatement stmt = con.prepareCall("{call SP_INSERTAR_PERSONA(?,?,?)}");
            stmt.setInt(1, 88888888);
            stmt.setString(2, "Renato");
            stmt.setInt(3, 40);
            stmt.execute();

            System.out.println("success");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

        /*Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/sonoo", "root", "root");

        CallableStatement stmt = con.prepareCall("{call SP_INSERTAR_PERSONA(?,?,?)}");
        stmt.setInt(1, 22224444);
        stmt.setString(2, "Luis");
        stmt.setInt(3, 5);
        stmt.execute();

        System.out.println("success");*/