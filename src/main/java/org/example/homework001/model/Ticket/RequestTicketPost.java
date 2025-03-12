package org.example.homework001.model.Ticket;

import lombok.*;
import org.example.homework001.model.Ticket.ApiReponse.Status;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestTicketPost {
    private String passengerName;
    private String travelDate;
    private String sourceStation;
    private String destinationStation;
    private double price;
    private boolean paymentStatus;
    private Status statusTicket;
    private String seatNumber;



//    private List<Ticket> tickets;

}
