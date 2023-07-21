package Assignment;

import java.time.LocalDate;
import java.util.ArrayList;

public class Traveller
{
	private String name;
	private Long mobile;
	private String email;
	private String flightid; 
	private LocalDate Date;
	public Traveller() {}
	public Traveller(String name, Long mobile, String email, String flightid, LocalDate date) 
	{
		
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightid = flightid;
		Date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
}
