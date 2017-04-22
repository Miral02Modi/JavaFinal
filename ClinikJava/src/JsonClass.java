import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonClass {

	public void jsInput(ArrayList ls) {
		
		JSONObject main = new JSONObject();
		JSONObject subjs = new JSONObject();
		JSONArray ja = new JSONArray();
		Doctor o1 = (Doctor) ls.get(0);

		ja.add(subjs);
		main.put("Doctor", ja);
		System.out.println(main);
	}

	/**
	 * file Writer
	 * 
	 * @param JSONArray
	 * @param fileName
	 */
	static void writeFileJson(JSONArray arr, String u) {
		FileWriter fw = null;
		JSONObject main = new JSONObject();
		main.put("Appointment", arr);

		try {
			fw = new FileWriter(Url.url + u);
			fw.write(main.toJSONString());
			fw.flush();
			System.out.println("Successful");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * json file reader
	 * 
	 * @param file
	 *            Name
	 * @return
	 */
	static JSONObject readFileJson(String u) {
		FileReader fis = null;
		JSONParser parser1 = new JSONParser();
		JSONObject jsonobj = null;
		try {

			fis = new FileReader(Url.url + u);
			Object obj = parser1.parse(fis);
			jsonobj = (JSONObject) obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonobj;
	}
}
