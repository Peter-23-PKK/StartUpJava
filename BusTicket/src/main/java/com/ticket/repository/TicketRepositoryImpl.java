package com.ticket.repository;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.ticket.dto.Bus;
import com.ticket.dto.Route;
import com.ticket.dto.Ticket;
import com.ticket.dto.TicketBooking;
import com.ticket.utils.DBConnector;

public class TicketRepositoryImpl implements TicketRepository {

	private static TicketRepositoryImpl instance;
	private DBConnector connector;
	private Properties properties;

	private TicketRepositoryImpl() {
		properties = new Properties();
		connector = DBConnector.getInstance();
		try (FileInputStream io = new FileInputStream("config.properties")) {
			properties.load(io);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static TicketRepositoryImpl getInstance() {
		return instance = instance != null ? instance : new TicketRepositoryImpl();
	}

	@Override
	public List<Ticket> findTicket(String from, String to) {
		List<Ticket> list = new ArrayList<Ticket>();
		try (PreparedStatement preparedStatement = connector.getConnection()
				.prepareStatement(properties.getProperty("ticket.select"))) {
			preparedStatement.setString(1, from);
			preparedStatement.setString(2, to);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				list.add(getTicket(rs));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private Ticket getTicket(ResultSet rs) throws SQLException {
		Ticket ticket = new Ticket();
		Bus bus = new Bus();
		Route route = new Route();
		bus.setBusLine(rs.getString(1));
		bus.setBusType(rs.getString(2));
		route.setFrom(rs.getString(3));
		route.setTo(rs.getString(4));
		ticket.setId(rs.getInt(5));
		ticket.setPrice(rs.getInt(6));
		ticket.setDepartureTime(LocalTime.parse(rs.getString(7)));
		ticket.setBus(bus);
		ticket.setRoute(route);
		return ticket;
	}

	@Override
	public Ticket findTicketById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> findAllTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTicketBooking(TicketBooking ticketBooking) {
		System.out.println(ticketBooking.getTicket().getId());
		try (PreparedStatement preparedStatement = connector.getConnection()
				.prepareStatement(properties.getProperty("ticketbooking.insert"))) {
			preparedStatement.setInt(1, ticketBooking.getTicket().getId());
			preparedStatement.setString(2, ticketBooking.getPassenger());
			preparedStatement.setInt(3, ticketBooking.getPersonCount());
			preparedStatement.setString(4, ticketBooking.getGender().toString());
			preparedStatement.setString(5, ticketBooking.getPhone());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
