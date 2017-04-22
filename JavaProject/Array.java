import java.util.*;
import java.lang.*;
import java.io.*;
class Array{
   
   public static void main(String args[]){
        
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter The rows::");
	int rows = sc.nextInt();
	System.out.print("Enter The cols::");
	int cols = sc.nextInt();
	String arr[][] = new String[rows][cols];

	for(int i=0;i<rows;i++){
	    for(int j=0;j<cols;j++){
	    	System.out.print("Enter The Data::");
		arr[i][j] = sc.next();
 	    }			
	}
	
	System.out.println("\n------------------------");
	PrintWriter pw = new PrintWriter(System.out);	
	for(int i=0;i<rows;i++){
	    for(int j=0;j<cols;j++){
		 pw.println(arr[i][j]);	
 	    }			
	}
	pw.flush();
	pw.close();	
	FileWriter fw = null;	
	try{	
	    fw = new FileWriter("Demo.txt");
	    for(int i=0;i<rows;i++){
  	        for(int j=0;j<cols;j++){
		   fw.write(arr[i][j]);
 	    }			
	   //fw.write("Success");		
	  System.out.println("Success");		
	} 	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(fw != null){
		   try{
		        fw.close();
		   }catch(Exception e){
			e.printStackTrace();
		   }   					
		}	
	}
	
	BufferedReader r = null;
	String s = "", line = null;	
	try{	
	r= new BufferedReader( new FileReader( "Demo.txt" ) );
	while ((line = r.readLine()) != null) {
   	s += line;
	}
	}catch(Exception e){
		System.out.println(e);					
	}
	System.out.println(s);
   }	
}
