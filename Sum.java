class Sum{
	public static void main(String args[]){
		int arr[] = {10,-10,0,20,-20};
		int count=0;
		for(int i=0 ; i< arr.length; i++){
		    for(int j=i+1 ; j< arr.length ;j++){
			for(int k=j+1 ;j< arr.length-1 ;j++){
			if((arr[i] + arr[j] + arr[k]) == 0){
				count++;			
			}
			}	
		    }			
			
		}	
		System.out.println(count);						
	}	
}	
