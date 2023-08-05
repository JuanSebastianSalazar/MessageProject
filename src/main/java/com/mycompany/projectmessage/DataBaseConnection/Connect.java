/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmessage.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author skitt
 */
public class Connect {

    //variable por la cual se guarda el estado de la conexion con la BD
    private static Connection connect;

    private static final String url = "jdbc:postgresql://localhost:5432/mensaje_app";
    private static final String user = "postgres";
    private static final String password = "0408";

    //variable la cual se usara para crear una sola instancia
    private static Connect instance;

    public Connect() {
    }

    public Connection getConnection() {

        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error connection: " + e.toString());
        }

        return connect;
    }
    //metodo para cerrar la conexion

    public void closeConnection() throws SQLException {
        try {

            connect.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            connect.close();
        } finally {
            connect.close();
        }
    }

    //patron singleton
    public static Connect getIntance() {
        if (instance == null) {
            instance = new Connect();
        }
        return instance;
    }
}
