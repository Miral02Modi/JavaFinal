import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ClinikAppTest {
	static Scanner choice = new Scanner(System.in);

	public static void main(String[] args) {

		Doctor doc = new Doctor();
		Appoinment mp = new Appoinment();
		JSONObject jobj = JsonClass.readFileJson("Appointment.json");

		for (int i = 0;; i++) {

			System.out.println("\n--------------------------------\n");
			System.out.println("1.Add your Appointment::");
			System.out.println("2.Search Doctor Information by Name::");
			System.out.println("3.Search Doctor Information by id::");
			System.out.println("4.Search patient Information by name::");
			System.out.println("5.Search patient Information by id::");
			System.out.println("6.Doctor Patient Report::");
			System.out.println("7.Famous doctor::");
			System.out.println("8.Search patient information by MobileNumber");
			System.out.println("9.Exit::");
			System.out.println("Enter Your Choice::");
			String ch = "0";
			try {
				ch = choice.next();
			} catch (Exception e) {
			}

			switch (ch) {
			case "1":
				mp.appoInput("Appointment.json");
				break;

			case "2":
				System.out.println("Search doctor by Name");
				try {
					doc.searchDoctor(choice.next());
				} catch (Exception e) {
					System.out.println("Enter The String type of data");
					caseException(ch);
				}
				break;
			case "3":
				System.out.println("Search doctor by Id");
				if (choice.hasNextInt()) {
					doc.searchDoctor(choice.nextInt());
				} else {
					System.out.println("Enter the Integer Type of data");
					caseException(ch);
				}
				break;

			case "4":
				System.out.println("Search Patient by Name");
				try {
					mp.searchPatient(choice.next());
				} catch (Exception e) {
					System.out.println("Enter The String type of data");
					caseException(ch);
				}
				break;

			case "5":
				System.out.println("Search Patient by id");
				if (choice.hasNextInt()) {
					mp.searchPatient(choice.nextInt());
				} else {
					System.out.println("Enter The Integer type of data");
					caseException(ch);
				}
				break;

				
			case "6":
				
				System.out.println("Enter The date for Doctor Patient Report::");
				try {
					mp.report(choice.next());
				} catch (Exception e) {
					System.out.println("Enter The String type of data");
					caseException(ch);
				}
				break;

				
			case "7":
				
				System.out.println("Famous Doctor is");
				mp.popularSpeliztion();
				break;

				
			case "8":
				demo1: System.out.println("Enter Patient Mobile Number");
				if (choice.hasNextLine()) {
					mp.searchPatientByMobileNum(choice.nextLong());
				} else {
					System.out.println("Enter The Integer type of data");
					caseException(ch);
					break;
				}
				break;

				
			case "9":
				break;

				
			default:
				System.out.println("Enter The valid choice");
				break;
			}

			if (ch.equals("9"))
				break;
		}
		if (choice != null) {
			choice.close();
		}

	}

	static void caseException(String ch) {

		Doctor doc = new Doctor();
		Appoinment mp = new Appoinment();
		JSONObject jobj = JsonClass.readFileJson("Appointment.json");

		switch (ch) {
		case "1":
			mp.appoInput("Appointment.json");
			break;

		case "2":
			System.out.println("Search doctor by Name");
			try {
				doc.searchDoctor(choice.next());
			} catch (Exception e) {
				System.out.println("Enter The String type of data");
			}
			break;
		case "3":
			System.out.println("Search doctor by Id");
			try {
				doc.searchDoctor(choice.nextInt());
			} catch (Exception e) {
				System.out.println("Enter the Integer Type of data");
			}
			break;
		case "4":
			System.out.println("Search Patient by Name");
			try {
				mp.searchPatient(choice.next());
			} catch (Exception e) {
				System.out.println("Enter The String type of data");
			}
			break;

		case "5":
			System.out.println("Search Patient by id");
			try {
				mp.searchPatient(choice.nextInt());
			} catch (Exception e) {
				System.out.println("Enter The Integer type of data");
			}
			break;

		case "6":
			System.out.println("Enter The date for Doctor Patient Report::");
			try {
				mp.report(choice.next());
			} catch (Exception e) {
				System.out.println("Enter The String type of data");
			}
			break;

		case "7":
			System.out.println("Famous Doctor is");
			mp.popularSpeliztion();
			break;

		case "8":
			demo1: System.out.println("Enter Patient Mobile Number");
			try {
				mp.searchPatientByMobileNum(choice.nextLong());
			} catch (InputMismatchException e) {
				System.out.println("Enter The Integer type of data");
				break;
			}
			break;
		case "9":
			break;
		default:
			System.out.println("Enter The valid choice");
			break;
		}
	}

}
