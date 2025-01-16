package com.ticket.dto;

import lombok.Data;

@Data
public class TicketBooking {

	private int id;
	private Ticket ticket;
	private String passenger;
	private String phone;
	private int personCount;
	private Gender gender;

}
