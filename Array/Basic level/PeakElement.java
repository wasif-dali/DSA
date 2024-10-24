public class PeakElement {

    // Function to find any peak element in the array
    public static int findPeak(int[] arr) {
        int n = arr.length;
        
        // Edge case: If the array has only one element, it's a peak
        if (n == 1) {
            return 0;
        }

        // Check the first and last elements separately
        if (arr[0] >= arr[1]) {
            return 0;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        // Traverse the array to find a peak element
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        // This line should never be reached due to array constraints
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeak(arr);

        System.out.println("Peak element is at index: " + peakIndex + 
                           " with value: " + arr[peakIndex]);
    }
}
