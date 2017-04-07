import java.io.IOException;

public class InventoryManagement {
	public static void main(String[] args) {
		JsonFileWriter fw = new JsonFileWriter();
		try {
			fw.jsonFileReader("/home/bridgeit/workspace/JsonJava/txtFile/jsonjava.txt");
			fw.jsonFileWriter("/home/bridgeit/workspace/JsonJava/txtFile/jsonjava.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
