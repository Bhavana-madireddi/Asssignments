package Assignment;

import java.util.ArrayList; 
public class Airport extends Traveller 
{ 
	Address adress;
	private ArrayList<Flight> flights;
	private ArrayList<Traveller> travellers; 
	private String source; 
	private String destination;
	private int availabletickets; 
	public String getSource()
	{ 
	return source;
	} 
	public String getDestination()
	{ 
	return destination; 
	} 
	public boolean addFlight(Flight flight)
	{
	flights.add(flight); 
	return true;
	} 
	public boolean searchflightBySourceAndDestination(String source,String destination)
	{ 
	if(flights.contains(source) && flights.contains(destination))
		return true;
		return false; 
	} 
	public void bookTickets(Traveller traveller) 
	{ 
	if(availabletickets==0) 
		System.out.println("tickets cannot be booked");
	else 
		travellers.add(traveller); 
	} 
	}