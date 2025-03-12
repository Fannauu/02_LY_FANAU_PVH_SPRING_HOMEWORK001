package org.example.homework001.model.Ticket.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestTicketIDs {
    private List<Integer> ticketIDs;
    private boolean paymentStatus;
}
