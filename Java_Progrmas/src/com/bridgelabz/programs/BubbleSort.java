package com.bridgelabz.programs;

 
class BubbleSort
{
   public static void main(String args[])
   {
	int arr[] = {1,4,3,5,2};
	arr = Util.bubbleSortInt(arr);
	for(int i =0 ; i < arr.length ;  i++)
	    System.out.println(arr[i]); 		
   }	
}		
