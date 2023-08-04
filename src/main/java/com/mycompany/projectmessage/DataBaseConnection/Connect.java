/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmessage.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author skitt
 */
public class Connect {

    Connection connect = null;

    String user = "postgres";
    String password = "0408";
    String database = "mensaje_app";
    String port = "5432";
    String ip = "localhost";

    String cadena = "jdbc:postgresql://" + ip + ":" + port + "/" + database;

    public Connection establishConnection() {

        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(cadena, user, password);
            JOptionPane.showMessageDialog(null, "Sucessful connection: ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error connection: " + e.toString());
        }

        return connect;
    }
}
