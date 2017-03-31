 import java.io.FileInputStream;	
 class BinarySearch
{
    public static void main(String args[])
    {
	String str="";
	try{
	     FileInputStream fin=new FileInputStream("/home/bridgeit/workspace/JavaProject/src/Demo.txt");
	     int i = 0;
	     while((i=fin.read())!=-1){ //read() return -1 if the data is not found other then it retuen byte
		   str = str + (char)i; 
	     }
	     System.out.println(str);		 	    
	}catch(Exception e){
	     e.printStackTrace();				
	}
	char ch[] =Util.bubbleSortString(str);
	System.out.println(Util.binarySearchString(ch,'m'));
   }	
}
