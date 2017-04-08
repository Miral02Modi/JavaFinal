import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClinikAppTest {

	public static void main(String[] args) {
		Doctor d1 = new Doctor();
		ArrayList<Doctor> ls = null;
		JsonClass jc = new JsonClass();
		JsonClass.readFileJson("DoctorJson.json");
		Appoinment mp = new Appoinment();
		mp.appoInput("Appointment.json");
	}
	
	
}
