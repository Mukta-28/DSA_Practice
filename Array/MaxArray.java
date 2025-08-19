//2. Find the Largest Element 
//Write a program to find the maximum element in an array. 
//Input: arr[] = {10, 25, 47, 85, 12}   
//Output: 85 

class MaxArray{
	
	public static void main(String[] args){
		
		int[] arr = {12,23,34,45,43};
		int max = arr[0];
		for(int i = 0; i< arr.length; i++){
			if(arr[i]>max){
			max  =	arr[i] ;
			}
			
		}
		System.out.println(max);
	}
}