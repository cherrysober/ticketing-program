/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticketingproject;

import TicketingData.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author ASUS
 */
public class TicketingProcess{
    private List<Ticket> ticketList;
    
    public TicketingProcess(){
    ticketList = new ArrayList<>();
}
    public void createTicket(int ticketID, String artistName, String concertName, double price) {
        Ticket ticket = new Ticket(ticketID, artistName, concertName, price);
        ticketList.add(ticket);
    }
    
    public final void displayTicket() {
        for (Ticket ticket : ticketList) {
            System.out.println("Showing all tickets available!");
            System.out.println(ticket);
            System.out.println("------------------------------");
        }
    }
    
    public void updateTicket(int ticketID, double newPrice) {
        for (Ticket ticket : ticketList) {
            if (ticket.getTicketID() == ticketID) {
                ticket.setPrice(newPrice);
                System.out.println("Ticket updated successfully.");
                return;
            }
        }
        System.out.println("Ticket ID is not available.");
    }
    
    public void deleteTicket(int ticketID) {
        Iterator<Ticket> iterator = ticketList.iterator();
        while(iterator.hasNext()) {
            Ticket ticket = iterator.next();
            if (ticket.getTicketID() == ticketID) {
                iterator.remove();
                System.out.println("Ticket has been deleted succesfully!");
                return;
            }
        }
        System.out.println("Ticket ID is not available");
    }
}
