package com.ticket.service;

import java.util.List;

import com.ticket.dto.Ticket;
import com.ticket.dto.TicketBooking;

public interface TicketService {

	List<Ticket> findTicket(String from, String to);

	Ticket findTicketById(int id);

	List<Ticket> findAllTicket();
	
	void saveTicketBooking(TicketBooking ticketBooking);
}
