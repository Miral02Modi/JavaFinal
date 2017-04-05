package com.BridgeIt.LinkedList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReader {

	String reader(String url) throws IOException {
		FileInputStream fis = new FileInputStream(url);
		int c;
		String s1="";
		  while( (c=fis.read())!=-1){
			  s1 = s1 + (char)c ;		
		  }
		return s1;
	}

}
