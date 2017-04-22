import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Appoinment {
	int patientId;
	String dname;
	String date;
	String time;
	String pname;
	static Scanner sc = new Scanner(System.in);

	public Appoinment() {

	}

	public Appoinment(String dname, String date, String pname) {
		this.dname = dname;
		this.date = date;
		this.pname = pname;
	}

	public boolean appoinment(JSONArray jarr, String date, String dname) {
		JSONObject jobj;
		int count = 0;
		for (int i = 0; i < jarr.size(); i++) {
			jobj = (JSONObject) jarr.get(i);
			String d = (String) jobj.get("Doctor_Name");
			String date1 = (String) jobj.get("Date");
			if (d.equalsIgnoreCase(dname) && date1.equalsIgnoreCase(date)) {
				++count;
			}
		}
		return count < 5;
	}

	public String dateIncerese(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(date));
		} catch (ParseException e) {
			System.out.println("Enter the valid Date");
		}
		c.add(Calendar.DATE, 1);
		date = sdf.format(c.getTime());
		return date;
	}

	public void appoInput(String url) {

		String date = currentDate();

		System.out.print("Enter The Doctor name::");
		String dname = sc.next();
		if (isDoctorAvilable(dname)) {
			System.out.print("Enter The patient name::");
			String pname = sc.next();
			System.out.print("Enter The patient ID::");
			String strId = sc.next();
			idValidator(strId);
			System.out.print("Enter The patient Mobile Number::");
			String strmobileNum = sc.next();
			mobileNumberValidate(strmobileNum);

			int id = Integer.parseInt(strId);
			long mobileNum = Long.parseLong(strmobileNum);
			JSONObject obj = JsonClass.readFileJson(url);
			JSONArray jarr = (JSONArray) obj.get("Appointment");
			JSONObject subjs = new JSONObject();

			if (appoinment(jarr, date, dname)) {

				subjs.put("Date", date);
				subjs.put("Patient_Name", pname);
				subjs.put("pid", new Integer(id));
				subjs.put("Doctor_Name", dname);
				subjs.put("Mobile_Num", mobileNum);
				jarr.add(subjs);
				JsonClass.writeFileJson(jarr, url);
			} else {
				date = dateIncerese(date);
				for (int i = 0;; i++) {

					System.out.println("This date isnot available");
					System.out.println("Enter The new Date::");
					date = sc.next();

					if (isDateValid(date, "dd-MM-yyyy") && appoinment(jarr, date, dname)) {
						subjs.put("Date", date);
						subjs.put("Patient_Name", pname);
						subjs.put("pid", new Integer(id));
						subjs.put("Doctor_Name", dname);
						subjs.put("Mobile_Num", mobileNum);
						jarr.add(subjs);
						JsonClass.writeFileJson(jarr, url);
						break;
					} else
						date = dateIncerese(date);
				}
			}
		} else {
			System.out.println("Enter the valid doctor name");
			appoInput(url);
		}
	}

	private boolean idValidator(String strId) {
		for (int i = 0; i < strId.length(); i++) {
			char id = strId.charAt(i);

			if (id > '0' && id < '9')
				return true;
		}
		System.err.println("Enter The valid id");
		appoInput("Appointment.json");
		return false;
	}

	boolean isDoctorAvilable(String sdname) {

		JSONObject obj = JsonClass.readFileJson("DoctorJson.json");
		JSONArray jarr = (JSONArray) obj.get("Doctor");
		JSONObject subjs = new JSONObject();

		for (int i = 0; i < jarr.size(); i++) {
			subjs = (JSONObject) jarr.get(i);
			String dname = (String) subjs.get("DoctorName");
			if (sdname.equalsIgnoreCase(dname)) {
				return true;
			}
		}
		return false;
	}

	boolean mobileNumberValidate(String mobileNum) {

		for (int i = 0; i < mobileNum.length(); i++) {
			char mobNum = mobileNum.charAt(i);

			if (mobNum > '0' && mobNum < '9')
				return true;
		}
		System.err.println("Enter The valid MobileNumber");
		appoInput("Appointment.json");
		return false;
	}

	void searchPatient(String sname) {

		JSONObject obj = JsonClass.readFileJson("Appointment.json");
		JSONArray jarr = new JSONArray();
		jarr = (JSONArray) obj.get("Appointment");
		boolean avilable = false;

		for (int i = 0; i < jarr.size(); i++) {

			obj = (JSONObject) jarr.get(i);
			String name = (String) obj.get("Patient_Name");

			if (name.equalsIgnoreCase(sname)) {
				System.out.println("Patient Name is ::" + obj.get("Patient_Name"));
				System.out.println("Last date you have registeed::" + obj.get("Date"));
				System.out.println("Patient id is::" + obj.get("pid"));
				System.out.println("Patient mobile Number::" + obj.get("Mobile_Num"));
				avilable = true;
				break;
			}
		}
		if (avilable == false)
			System.out.println("Data is not avilable");
	}

	void searchPatient(long id) {

		JSONObject obj = JsonClass.readFileJson("Appointment.json");
		JSONArray jarr = new JSONArray();
		jarr = (JSONArray) obj.get("Appointment");
		boolean avilable = false;
		for (int i = 0; i < jarr.size(); i++) {

			obj = (JSONObject) jarr.get(i);
			long pid = (long) obj.get("pid");

			if (pid == id) {
				System.out.println("Patient Name is ::" + obj.get("Patient_Name"));
				System.out.println("Last date you have registeed::" + obj.get("Date"));
				System.out.println("Patient id is::" + obj.get("pid"));
				System.out.println("Patient mobile Number::" + obj.get("Mobile_Num"));
				avilable = true;
				break;
			}
		}
		if (avilable == false)
			System.out.println("Data is not avalable");
	}

	void searchPatientByMobileNum(long smobNum) {

		JSONObject obj = JsonClass.readFileJson("Appointment.json");
		JSONArray jarr = new JSONArray();
		jarr = (JSONArray) obj.get("Appointment");
		boolean avilable = false;
		for (int i = 0; i < jarr.size(); i++) {

			obj = (JSONObject) jarr.get(i);
			long mobNum = (long) obj.get("Mobile_Num");

			if (mobNum == smobNum) {
				System.out.println("Patient Name is ::" + obj.get("Patient_Name"));
				System.out.println("Last date you have registeed::" + obj.get("Date"));
				System.out.println("Patient id is::" + obj.get("pid"));
				System.out.println("Patient mobile Number::" + obj.get("Mobile_Num"));
				avilable = true;
				break;
			}
		}
		if (avilable == false)
			System.out.println("Data is not avalable");
	}

	void report(String sdate) {
		JSONObject obj = JsonClass.readFileJson("Appointment.json");
		JSONArray jarr = new JSONArray();
		jarr = (JSONArray) obj.get("Appointment");

		boolean data = false;
		if (isDateValid(sdate, "dd-MM-yyyy")) {
			for (int i = 0; i < jarr.size(); i++) {

				obj = (JSONObject) jarr.get(i);
				String date = (String) obj.get("Date");

				if (date.equals(sdate)) {
					System.out.println("Patient Name is ::" + obj.get("Patient_Name"));
					System.out.println("Last date you have registeed::" + obj.get("Date"));
					System.out.println("Patient id is::" + obj.get("pid"));
					System.out.println("Patient mobile Number::" + obj.get("Mobile_Num"));
					data = true;
				}
			}
			if (data == false)
				System.out.println("Data is not avilable");
		} else {
			System.err.println("Enter the valid date");
		}
	}

	public String currentDate() {
		Date todaysDate = new Date();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String DateToString = df.format(todaysDate);
		return DateToString;
	}

	void popularSpeliztion() {

		JSONObject obj = JsonClass.readFileJson("Appointment.json");
		JSONArray jarr = new JSONArray();
		jarr = (JSONArray) obj.get("Appointment");
		int doctCount1 = 0, doctCount2 = 0, doctCount3 = 0, doctCount4 = 0;

		for (int i = 0; i < jarr.size(); i++) {
			obj = (JSONObject) jarr.get(i);
			String dname = (String) obj.get("Doctor_Name");

			if (dname.equalsIgnoreCase("Miral")) {
				doctCount1++;
			} else if (dname.equalsIgnoreCase("Jayesh")) {
				doctCount2++;
			} else if (dname.equalsIgnoreCase("Srikanth")) {
				doctCount3++;
			} else if (dname.equalsIgnoreCase("Kalpesh")) {
				doctCount4++;
			}
		}

		if ((doctCount1 > doctCount2) && (doctCount1 > doctCount3) && (doctCount1 > doctCount4)) {
			System.out.println("Doctor Name is::" + "Miral");
			System.out.println("Specializtion::" + "Dentist");
		} else if ((doctCount2 > doctCount1) && (doctCount2 > doctCount3) && (doctCount2 > doctCount4)) {
			System.out.println("Doctor Name is" + "Jayesh");
			System.out.println("Specializtion::" + "Cardiologist");
		} else if ((doctCount3 > doctCount1) && (doctCount3 > doctCount2) && (doctCount3 > doctCount4)) {
			System.out.println("Doctor Name is" + "Srikanth");
			System.out.println("Specializtion::" + "Gynecologist");
		} else {
			System.out.println("Doctor Name is" + "Kalpesh");
			System.out.println("Specializtion::" + "Immunologist");
		}
	}

	public boolean isDateValid(String dateToValidate, String dateFromat) {

		if (dateToValidate == null) {
			return false;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);

		try {
			java.util.Date date = sdf.parse(dateToValidate);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

}
