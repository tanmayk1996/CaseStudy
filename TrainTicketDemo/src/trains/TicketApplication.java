package trains;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrainDao trainDao = new TrainDao();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter train id ");

		//Train train = trainDao.findTrain(scanner.nextInt());
		// System.out.println("Price of ticket is"+train.getTicketPrice());

		System.out.println("enter the travel date");
		String travelDate = scanner.next();
		LocalDate.parse(travelDate, dt);

		System.out.println("travel date" + dt);

	}

}
