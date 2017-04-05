 class Insertion
{
   public static void main(String args[])
   {
	String str ="hello welcome to java world";
	  char ch[] = Util.insertionSort(str.toCharArray());
	for(int i =0 ; i < ch	.length ;  i++)
	    System.out.println(ch[i]);
   }  	
}
