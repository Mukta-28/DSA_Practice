//Check if an Array is Sorted 
//Write a method to check whether an array is sorted in ascending order. 
//Input: arr[] = {1, 2, 3, 4, 5}   
//Output: true   
//Input: arr[] = {1, 3, 2, 4, 5}   
//Output: false

class SortedArray{
	
	static boolean isSorted(int[] arr){
		int n = arr.length;
		
		 for (int i = 1; i < n; i++)
            if (arr[i - 1] > arr[i])
                return false;

        return true;
    }
	
	public static void main(String[] args){
		int arr[] = { 10, 20, 30, 40, 50 };
		
        int n = arr.length;

        if (isSorted(arr))
            System.out.print("true\n");
        else
            System.out.print("false\n");
		
		
	}
}