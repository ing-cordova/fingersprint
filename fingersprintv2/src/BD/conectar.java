/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class conectar {
    
    Connection con = null;

    public Connection conexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/unab";
            String user = "root";
            String pass = "root";

            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null, "error de conexion " + e);
        }

        return con;
    }

    public Connection cerrarConexion() {
        try {
            con.close();
            System.out.println("cerrando conexion");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        con = null;
        return con;
    }
}
