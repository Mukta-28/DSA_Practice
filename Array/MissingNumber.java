public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5}; // Example
        int n = arr.length + 1;   // Array is of size n-1

        // Step 1: Calculate total sum
        int totalSum = n * (n + 1) / 2;

        // Step 2: Calculate array sum
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        // Step 3: Missing number
        int missing = totalSum - arrSum;
        System.out.println("Missing number: " + missing);
    }
}
