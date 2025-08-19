//3. Find the Smallest Element 
//Modify the previous program to find the smallest element in an array. 
//Input: arr[] = {10, 25, 47, 85, 12}   
//Output: 10  

class MinArray{
	
	public static void main(String[] args){
		
		int[] arr = {12,23,21,1,23,34};
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
} 