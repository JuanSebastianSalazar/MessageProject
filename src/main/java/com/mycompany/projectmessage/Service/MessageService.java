/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmessage.Service;

import com.mycompany.projectmessage.DAO.MessageDAO;
import com.mycompany.projectmessage.Model.Messages;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author skitt
 */
public class MessageService {
     //creamos los metodos que va a recibir el menu y se conecta con la capa DAO
    //para enviar a la BBDD
    
    public static void createMessage() throws SQLException {
        Scanner data = new Scanner(System.in);
        System.out.println("Write your message");
        String message = data.nextLine();
        
        System.out.println("Write name of author");
        String name = data.nextLine();
        
        Messages register = new Messages();
        register.setMensaje(message);
        register.setAutor_mensaje(name);
        
        MessageDAO.CreateMessageDB(register);
    }
    
    public static void listMessage(){
        
    }
    
    public static void deleteMessage(){
        
    }
    
    public static void editMessage(){
        
    }
}
