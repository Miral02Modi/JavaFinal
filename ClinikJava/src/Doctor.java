import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author Miral
 */
public class Doctor {
	final int id;
	String name;
	String specilized;
	String date;

	public Doctor() {
		super();
		this.id = 0;
		this.name = "";
		this.specilized = "";
		this.date = "";
	}

	public Doctor(int id, String name, String specilized, String date) {
		super();
		this.id = id;
		this.name = name;
		this.specilized = specilized;
		this.date = date;
	}

	void searchDoctor(String sname) {

		JSONObject obj = JsonClass.readFileJson("DoctorJson.json");
		JSONArray jarr = new JSONArray();
		jarr = (JSONArray) obj.get("Doctor");
		boolean avilable = false;
		for (int i = 0; i < jarr.size(); i++) {

			obj = (JSONObject) jarr.get(i);
			String name = (String) obj.get("DoctorName");
			if (name.equalsIgnoreCase(sname)) {
				System.out.println("Patient Name is ::" + obj.get("DoctorName"));
				System.out.println("Specialized In::" + obj.get("Specialied"));
				System.out.println("Doctor id is::" + obj.get("ID"));
				avilable = true;
				break;
			}
		}
		if (avilable == false)
			System.out.println("Enter the valid data2");
	}

	void searchDoctor(long id) {

		JSONObject obj = JsonClass.readFileJson("DoctorJson.json");
		JSONArray jarr = new JSONArray();
		jarr = (JSONArray) obj.get("Doctor");
		boolean avilable = false;

		for (int i = 0; i < jarr.size(); i++) {

			obj = (JSONObject) jarr.get(i);
			long pid = (long) obj.get("ID");

			if (pid == id) {
				System.out.println("Doctor Name is ::" + obj.get("DoctorName"));
				System.out.println("Specialized In::" + obj.get("Specialied"));
				System.out.println("Doctor id is::" + obj.get("ID"));
				avilable = true;
				break;
			}
		}
		if (avilable == false)
			System.out.println("Data is not avilable");
	}
}
