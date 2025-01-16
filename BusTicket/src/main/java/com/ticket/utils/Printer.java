package com.ticket.utils;

import java.time.LocalDate;
import java.util.List;

import com.ticket.dto.Ticket;

public class Printer {

	private static String busLinePattern = "%-2d. %-15s (%-8s)%n";
	private static String locationPattern = "%-4s %-6s: %-10s%n";
	private static String datePattern = "%-4s %-6s: %tD%n";
	private static String digitPattern = "%-4s %-6s: %-6d%n";
	private static String timePattern = "%4s %-6s : %tl:%tM %tp%n";

	public static void printTicketList(List<Ticket> tickets, LocalDate date, Integer personInteger) {
		for (int i = 0; i < tickets.size(); i++) {
			System.out.printf(busLinePattern, (i + 1), tickets.get(i).getBus().getBusLine(),
					tickets.get(i).getBus().getBusType());
			System.out.printf(locationPattern, "", "From", tickets.get(i).getRoute().getFrom());
			System.out.printf(locationPattern, "", "To", tickets.get(i).getRoute().getTo());
			System.out.printf(datePattern, "", "Date", date);
			System.out.printf(timePattern, "", "Time", tickets.get(i).getDepartureTime(),
					tickets.get(i).getDepartureTime(), tickets.get(i).getDepartureTime());
			System.out.printf(digitPattern, "", "Price", tickets.get(i).getPrice());

		}
	}

}
