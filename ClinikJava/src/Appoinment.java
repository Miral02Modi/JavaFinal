import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Appoinment {
	static int patientId;
	String dname;
	String date;
	String time;
	String pname;
	static Scanner sc = new Scanner(System.in);

	public Appoinment(String dname, String date, String pname) {
		this.dname = dname;
		this.date = date;
		this.pname = pname;
	}

	public Appoinment() {
	}

	public void appoInput(String url) {
		
		System.out.println("Enter The appoinment Date");
		String date = sc.next();
		System.out.println("Enter The Doctor name");
		String dname = sc.next();
		System.out.println("Enter The patient name");
		String pname = sc.next();
		JSONObject obj = JsonClass.readFileJson(url);
		JSONArray jarr = (JSONArray) obj.get("Appointment");
		JSONObject subjs = new JSONObject();

		subjs.put("patient_Name", pname);
		subjs.put("Doctor_Name", dname);
		subjs.put("Appointmenr_ID", new Integer(1));
		subjs.put("date", date);
		jarr.add(subjs);
		
		JsonClass.writeFileJson(jarr, url);
	}
}
