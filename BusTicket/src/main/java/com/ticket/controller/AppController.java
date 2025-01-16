package com.ticket.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.ticket.dto.Gender;
import com.ticket.dto.Ticket;
import com.ticket.dto.TicketBooking;
import com.ticket.service.TicketService;
import com.ticket.service.TicketServiceImpl;
import com.ticket.utils.InputUtils;
import com.ticket.utils.Printer;

public class AppController {

	private TicketService service;

	public AppController() {
		service = TicketServiceImpl.getInstance();
	}

	public void start() {
		findTicket();
	}

	private void findTicket() {
		System.out.println("======== WelCome ========");
		String fromString = InputUtils.getString("From :").toLowerCase();
		String toString = InputUtils.getString("To :").toLowerCase();
		LocalDate date = InputUtils.getDate("Date :");
		int perCount = InputUtils.getNumber("Person :");
		List<Ticket> tickets = service.findTicket(fromString, toString);
		Printer.printTicketList(tickets, date, perCount);
		saveTicketBooking(tickets, date, perCount);
	}

	private void saveTicketBooking(List<Ticket> tickets, LocalDate date, int perCount) {
		TicketBooking ticketBooking = new TicketBooking();
		ticketBooking.setPassenger(InputUtils.getString("Enter your name:"));
		ticketBooking.setPersonCount(perCount);
		ticketBooking.setPhone(InputUtils.getString("Enter your phone number:"));
		ticketBooking.setTicket(tickets.get(InputUtils.getNumber("Enter the bus line:") - 1));
		Arrays.stream(Gender.values()).forEach(System.out::print);
		ticketBooking.setGender(Gender.values()[InputUtils.getNumber("Select Gender : ") - 1]);
		service.saveTicketBooking(ticketBooking);
		
		
	}
}
