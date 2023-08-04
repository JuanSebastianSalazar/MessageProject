/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projectmessage;

import com.mycompany.projectmessage.Service.MessageService;
import java.util.Scanner;

/**
 *
 * @author skitt
 */
public class MensajeApp {

    public static void main(String[] args) {
        
        int response = 0;

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
            response = Integer.valueOf(data.nextInt());

            switch (response) {
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.editMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                    System.out.println("Gracias por usar el programa....");
                    break;
            }

        } while (response != 5);
    }
}
