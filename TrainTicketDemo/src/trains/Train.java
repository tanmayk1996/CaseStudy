package trains;

public class Train {

	private int train_number;
	private String train_name;
	private String source;
	private String destination;
	private double ticket_price;

	public Train(int train_number, String train_name, String source, String destination, double ticket_price) {
		super();
		this.train_number = train_number;
		this.train_name = train_name;
		this.source = source;
		this.destination = destination;
		this.ticket_price = ticket_price;
	}

	public int getTrain_number() {
		return train_number;
	}

	public void setTrain_number(int train_number) {
		this.train_number = train_number;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}

}
