import java.util.Arrays;
class ReverseArrays{
	
	public static void main(String[] args){
		
		int[] arr = {12,23,34,65};
		
		for(int i=0;i<arr.length-1;i++){
			
			int t = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}

