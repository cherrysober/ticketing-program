/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicketingData;

/**
 *
 * @author ASUS
 */

public final class Ticket{
    private int ticketID;
    private String artistName;
    private String concertName;
    private double price;
    
    public Ticket(int ticketID, String artistName, String concertName, double price) {
        this.ticketID = ticketID;
        this.artistName = artistName;
        this.concertName = concertName;
        this.price = price;
    }
    
    public int getTicketID(){
        return ticketID;
    }
    
    public void setTicketID(int ticketID){
        this.ticketID = ticketID;
    }
    
    public String getArtistName(){
        return artistName;
    }
    
    public void setArtistName(String artistName){
        this.artistName = artistName;
    }
    
    public String getConcertName(){
        return concertName;
    }
    
    public void setConcertName(String concertName){
        this.concertName = concertName;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "Ticket ID" + ticketID +
                "\nArtist Name: " + artistName +
                "\nConcert Name: " + concertName +
                "\nPrice: Rp. " + price;
    }
}