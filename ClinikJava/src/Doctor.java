import java.util.ArrayList;
import java.util.Scanner;

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
		this.name="";
		this.specilized="";
		this.date="";
	}

	public Doctor(int id, String name, String specilized, String date) {
		super();
		this.id = id;
		this.name = name;
		this.specilized = specilized;
		this.date = date;
	}

	

	public boolean oppoinMentCheck() {
		return false;
	}
}
