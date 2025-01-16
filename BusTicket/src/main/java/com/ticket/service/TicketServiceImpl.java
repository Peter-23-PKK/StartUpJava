package com.ticket.service;

import java.util.List;

import com.ticket.dto.Ticket;
import com.ticket.dto.TicketBooking;
import com.ticket.repository.TicketRepository;
import com.ticket.repository.TicketRepositoryImpl;

public class TicketServiceImpl implements TicketService {

	private static TicketServiceImpl instance;
	private TicketRepository repo;

	private TicketServiceImpl() {
		repo = TicketRepositoryImpl.getInstance();
	}

	public static TicketServiceImpl getInstance() {
		return instance = instance != null ? instance : new TicketServiceImpl();
	}

	@Override
	public List<Ticket> findTicket(String from, String to) {
		return repo.findTicket(from, to);
	}

	@Override
	public Ticket findTicketById(int id) {
		
		return null;
	}

	@Override
	public List<Ticket> findAllTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTicketBooking(TicketBooking ticketBooking) {
		repo.saveTicketBooking(ticketBooking);
	}

}
