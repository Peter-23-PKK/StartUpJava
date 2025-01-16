package com.ticket.repository;

import java.util.List;

import com.ticket.dto.Ticket;
import com.ticket.dto.TicketBooking;

public interface TicketRepository {

	List<Ticket> findTicket(String from, String to);

	Ticket findTicketById(int id);

	List<Ticket> findAllTicket();

	void saveTicketBooking(TicketBooking ticketBooking);
}
