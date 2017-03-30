class Anagram{
    
     public static void main(String args[])
     {
	String s1 = "Peek";
	String s2 = "keep";
	
	s1 = removeSpace(s1);
	s2 = removeSpace(s2);
	s1 = lowerCase(s1);
	s2 = lowerCase(s2);
	s1 = sort(s1);
	s2 = sort(s2);
	System.out.println(isAnagram(s1,s2));
     }
  
    static String lowerCase(String str)
    {
	char ch[] = str.toCharArray();
	for(int i=0 ; i < ch.length ; i++)
        {
		if(ch[i] >= 'A' && ch[i] <= 'Z')
                {
		    ch[i] =(char) (ch[i] + 32);			
		}	
	}
	return new String(ch);
    }

    static String removeSpace(String str){
    	char ch[] = str.toCharArray();
	String chg="";
	for(int i=0 ; i < ch.length ; i++)
        {
		if(ch[i] != ' ')
                {
                    chg = chg + ch[i];
		}	
	}
	return chg;
    }
    
    static String sort(String str)
    {
	char ch[] = str.toCharArray();
        char swap;  
         for(int i=0; i < ch.length; i++){  
                 for(int j=1; j < (ch.length-i); j++)
		{  
                         if(ch[j-1] > ch[j])
			 {  
                                 swap = ch[j-1];  
                                 ch[j-1] = ch[j];  
                                 ch[j] = swap;  
                         }  
                          
                 }  
         } 
	 return new String(ch);								    				 	 
    }

    static String isAnagram(String str1 , String str2)
    {
	if(str1.equals(str2))
	    return "It is Anageam";
	else
	    return "It is not Anageam";	
    }		   
}
