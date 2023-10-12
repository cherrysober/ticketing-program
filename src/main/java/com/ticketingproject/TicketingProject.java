/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ticketingproject;

import java.util.Scanner;



/**
 *
 * @author ASUS
 */
public class TicketingProject {
    public static void main(String[] args) {
        TicketingProcess ticketingProcess = new TicketingProcess();
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        do {
       
            System.out.println("Welcome to Lavender Ticketing!");
            System.out.println("==============================");
            System.out.println("1. Create Ticket");
            System.out.println("2. Display Ticket");
            System.out.println("3. Update Ticket Price");
            System.out.println("4. Delete Ticket");
            System.out.println("5. Exit");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1: {
                    System.out.print("Enter Ticket ID: ");
                    int ticketID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Artist Name: ");
                    String artistName = scanner.nextLine();
                    System.out.print("Enter Concert Name: ");
                    String concertName = scanner.nextLine();
                    System.out.print("Enter Price: Rp.");
                    double price = scanner.nextDouble();
                    ticketingProcess.createTicket(ticketID, artistName, concertName, price);
                    System.out.println("Ticket has been created!");
                }
                    
                case 2: {
                    ticketingProcess.displayTicket();
                    break;
                }
                
                case 3: {
                    System.out.print("Enter Ticket ID to Update: ");
                    int updateID = scanner.nextInt();
                    System.out.print("Enter New Price: Rp.");
                    double newPrice = scanner.nextDouble();
                    ticketingProcess.updateTicket(updateID, newPrice);
                    break;
                }
                
                case 4: {
                    System.out.print("Enter Ticket ID to Delete: ");
                    int deleteID = scanner.nextInt();
                    ticketingProcess.deleteTicket(deleteID);
                    break;
                }
                
                case 5: {
                    System.out.println("Thank You for Visiting Lavender Ticketing!");
                    break;
                }
                default:
                    System.out.println("Invalid choice, please choose from the options!");
                }
            if (choice != 5) {
                System.out.print("Do you want to continue (1 for Yes, 0 for No): ");
                int continueChoice = scanner.nextInt();
                if (continueChoice != 1) {
                    choice = 5;
                }
            }
        }while (choice!=5);
        }
    }

