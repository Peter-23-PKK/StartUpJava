package com.ticket.dto;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	
	private int id;
	private Bus bus;
	private Route route;
	private int price;
	private LocalTime departureTime;
	private Ticket ticket;

}
