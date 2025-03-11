package org.example.homework001.controller;

import io.swagger.v3.oas.models.responses.ApiResponse;
import org.example.homework001.model.Ticket.Ticket;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController {

    public ArrayList<Ticket> tickets = new ArrayList<>(Arrays.asList(

            new Ticket(1,"Bob","20-03-2023","Kps","PP",20,"Completed","BOOKED",1)
            ,new Ticket(2,"Bobe","20-03-2023","SR","PP",20,"Completed","BOOKED",1)
    ));

    @GetMapping("/allTicket")
    public ArrayList<Ticket> getAllTickets(){
        return tickets;
    }

    @PostMapping("/addTicket")
    public ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Successfully","true");
        headers.add("Messages","Ticket Created Successfully");
        tickets.add(ticket);
        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(ticket);
    }




}
