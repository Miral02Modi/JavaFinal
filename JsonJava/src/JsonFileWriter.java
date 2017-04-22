import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileWriter {

	public static void jsonFileWriter(String url) throws IOException {
		
		JSONObject jobj = new JSONObject();
		JSONArray rice = new JSONArray();
		JSONArray wheet = new JSONArray();
		JSONArray pulses = new JSONArray();
		JSONObject sub;
		
		
		System.out.println("Enter The number of data you want to enter");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			sub = new JSONObject();
			
			System.out.println("1. Wheat::");
			System.out.println("2. Pulse::");
			System.out.println("3. Rice::");
			System.out.print("Enter the choice::");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the wheat type");
				sub.put("Type", sc.next());
				System.out.println("Enter the wheat Weight");
				sub.put("Weight", sc.next());
				System.out.println("Enter the wheat Price");
				sub.put("Price", sc.next());
				wheet.add(sub);
				jobj.put("Wheet", wheet);
				break;
			case 2:
				System.out.println("Enter the Pulse type");
				sub.put("Type", sc.next());
				System.out.println("Enter the Pulse Weight");
				sub.put("Weight", sc.next());
				System.out.println("Enter the Pulse Price");
				sub.put("Price", sc.next());
				pulses.add(sub);
				jobj.put("Pulses", pulses);
				break;
			case 3:
				System.out.println("Enter the Rice type");
				sub.put("Type", sc.next());
				System.out.println("Enter the Rice Weight");
				sub.put("Weight", sc.next());
				System.out.println("Enter the Rice Price");
				sub.put("Price", sc.next());
				rice.add(sub);
				jobj.put("Rice", rice);
				break;
			default:
				break;
			}
		}
		FileWriter jsonfw=null;
		try {
			jsonfw = new FileWriter(url);
			jsonfw.write(jobj.toJSONString());
			jsonfw.flush();
			System.out.println("DataInserted successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			sc.close();
			try {
				jsonfw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static JSONObject jsonFileReader(String url) throws IOException {
		FileReader fis=null;
		JSONParser parser1 = new JSONParser();
		JSONObject jsonobj = null;
		try {
			 
			fis= new FileReader(url);
			Object obj = parser1.parse(fis);
			jsonobj = (JSONObject) obj;
			System.out.println("Data Retrived Successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jsonobj;
	}
	
}
