package trains;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import trains.Passenger;
import trains.Ticket;
import trains.Train;

public class TrainDao {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/train1";
	static final String USER = "root";
	static final String PASSWord = "Anonnymus@1996";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;
		String source;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWord);
			stmt = conn.createStatement();
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			Date d = new Date();
			System.out.println("+++++++++Ticket Application++++++");
			int trainNo;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Train no: ");

			trainNo = sc.nextInt();
			String sql = "SELECT TRAIN_NO, TRAIN_NAME, SOURCE, DESTINATION,TICKET_PRICE FROM TRAINS where TRAIN_NO="
					+ trainNo;
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

				int trainno = rs.getInt("TRAIN_NO");
				String trainname = rs.getString("TRAIN_NAME");
				source = rs.getString("SOURCE");
				String destination = rs.getString("DESTINATION");
				double ticket_price = rs.getDouble("TICKET_PRICE");
				Train t = new Train(trainno, trainname, source, destination, ticket_price);
				System.out.println("Enter number of passenger:");
				int n = sc.nextInt();
				int age[] = new int[n];
				String name[] = new String[n];
				char gender[] = new char[n];
				for (int i = 0; i < n; i++) {

					System.out.println("Enter name: ");

					name[i] = sc.next();
					System.out.println("Enter age: ");
					age[i] = sc.nextInt();
					System.out.println("Enter gender: ");
					gender[i] = sc.next().charAt(0);
					Passenger p = new Passenger(name[i], age[i], gender[i]);
					Ticket t1 = new Ticket();
					char a = source.charAt(0);
					char b = destination.charAt(0);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
					String das = sdf.format(new Date());
					System.out.println(das);
					t1.generatePNR(a, b, das);
				}

			}
		}

		catch (Exception e) {
			System.out.print(e);
		}

	}

}
