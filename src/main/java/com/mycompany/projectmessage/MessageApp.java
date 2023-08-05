/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projectmessage;

import com.mycompany.projectmessage.DataBaseConnection.Connect;
import com.mycompany.projectmessage.Service.MessageService;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author skitt
 */
public class MessageApp {

    public static void main(String[] args) throws SQLException {
        
        int response = 0;
       Connect connect = new Connect();
       connect.getConnection();
        do {
            System.out.println("________________________");
            System.out.println("Aplication of messages");
            System.out.println("1. Create message");
            System.out.println("2. List message");
            System.out.println("3. Edit message");
            System.out.println("4. Delete message");
            System.out.println("5. Exit ");
            //leemos la opcion del usuario
            Scanner data = new Scanner(System.in);
            response = data.nextInt();

            switch (response) {
                case 1 -> MessageService.createMessage();
                case 2 -> MessageService.listMessage();
                case 3 -> MessageService.editMessage();
                case 4 -> MessageService.deleteMessage();
                default -> System.out.println("Gracias por usar el programa....");
            }

        } while (response != 5);
    }
}
