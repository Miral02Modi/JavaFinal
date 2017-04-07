import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDemo {
	public static void main(String args[]) {
	
		/*JSONObject obj = new JSONObject();
		obj.put("Name", "Miral");
		obj.put("age",new Integer(25));
		obj.put("Balance", new Double(10000.00));
		
		JSONObject emp = new JSONObject();
		emp.put("EmpName", "Kailash");
		emp.put("EmpID", new Integer(10));
		emp.put("Salary",new Double(10000));
		
		JSONArray arr = new JSONArray();
		arr.add("Miral");
		arr.add("Modi");
		arr.add(new Integer(20));
		obj.put("Message", arr);
		obj.put("Employee", emp);
		System.out.println(obj);
		System.out.println("----------------------");
		//System.out.println(obj.get("Employee"));
		obj = (JSONObject) obj.get("Employee");
		System.out.println(obj);
		System.out.println(obj.get("Salary"));
		System.out.println(obj.get(JSONObject"Salary")+" "+obj.get("EmpID")+" "+obj.get("EmpName"));*/
		
		JSONObject obj = new JSONObject();
		JSONObject emp1 = new JSONObject();
		
		JSONArray arr = new JSONArray();
		arr.add(emp1);
		emp1.put("Name", "Miral");
		emp1.put("ID", new Integer(10));
		emp1.put("Sal", new Double(10000));
		arr.add(emp1);
		obj.put("Employee",arr);
		System.out.println(obj);
	}
}
