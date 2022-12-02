package transacciones;

import java.sql.*; 
public class Transacciones {

    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo", "root", "root");
        con.setAutoCommit(false);

        Statement stmt = con.createStatement();
        stmt.executeUpdate("insert into personas values(7777777,'Oscar',10)");
        stmt.executeUpdate("insert into alumnos values(2222,'Patricia',11)");

        con.commit();
        con.close();
    }
}

