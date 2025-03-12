package org.example.homework001.model.Ticket;

import lombok.*;
import org.example.homework001.model.Ticket.ApiReponse.Status;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketPost {
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
