/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmessage.DAO;

import com.mycompany.projectmessage.DataBaseConnection.Connect;
import com.mycompany.projectmessage.Model.Messages;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skitt
 */
public class MessageDAO {

    //patron singleton para instanciar una vez
    public static Connection getConnection() throws SQLException {
        Connect dbConnection = Connect.getIntance();
        return dbConnection.getConnection();
    }

    static String cantCreateMessage = "\n no se pudo crear el mensaje \n";
    static String createdMessage = "\n mensaje creado \n";
    static String cantListMessages = "\n no se pudo listar los mensajes \n";
    static String deletedMessage = "\n mensaje eliminado \n";
    static String cantDeleteMessages = "\n no se pudo eliminar el mensaje \n";

    //aca se hace el CRUD 
    public static void CreateMessageDB(Messages message) {
        try (Connection connection = getConnection()) {
            PreparedStatement ps = null;
            try {
                String query;
                query = "INSERT INTO general.mensajes (mensaje, autor_mensaje, fecha_mensaje) VALUES(?,?,CURRENT_TIMESTAMP)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMensaje());
                ps.setString(2, message.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println(createdMessage);
            } catch (SQLException e) {
                System.out.println(cantCreateMessage + ": " + e);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void readMessageDB() {

    }

    public static void deleteMessageDB(int id_mensaje) {

    }

    public static void updateMessageDB(Messages message) {

    }

}
