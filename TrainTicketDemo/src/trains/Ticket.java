package trains;

import java.util.*;

import java.util.TreeMap;
import java.time.LocalDate;

public class Ticket {

	private int count = 100;
	private String pnr;
	private LocalDate traveldate;
	private Train train;
	private TreeMap<Passenger, Integer> Passengers;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public LocalDate getTraveldate() {
		return traveldate;
	}

	public void setTraveldate(LocalDate traveldate) {
		this.traveldate = traveldate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Integer> getPassengers() {
		return Passengers;
	}

	public void setPassengers(TreeMap<Passenger, Integer> passengers) {
		this.Passengers = passengers;
	}

	public String generatePNR()
	{
		String str=String.valueOf(train.getSource(.charAt(0)));
	}

	double passengerfareCal(Passenger passenger) {

		if (passenger.getAge() <= 12)
			return (0.5) * (train.getTicket_price());

		else if (passenger.getAge() >= 60)
			return (0.6) * (train.getTicket_price());

		else if (passenger.getGender('F'))
			return (0.25) * (train.getTicket_price());

		else
			return train.getTicket_price();
	}

	public void addPassenger(String name, int age, char gender) throws NullPointerException {

		// Passenger p = new Passenger(name, age, gender);

	}

}
