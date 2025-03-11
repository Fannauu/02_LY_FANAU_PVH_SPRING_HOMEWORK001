package org.example.homework001.model.Ticket;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {
    private int id;
    private String passengerName;
    private String travelDate;
    private String sourceStation;
    private String destinationStation;
    private double price;
    private String paymentStatus;
    private String statusTicket;
    private int seatNumber;
}
