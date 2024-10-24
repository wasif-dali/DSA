public class PeakElement {

    // Function to find a peak element using an iterative binary search
    public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Binary search loop
        while (low < high) {
            int mid = low + (high - low) / 2;

            // If the middle element is less than the next one,
            // the peak lies to the right
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                // If the middle element is greater than or equal to the next one,
                // the peak lies to the left (including mid)
                high = mid;
            }
        }

        // Low and high will eventually converge to the peak element
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        // Perform binary search for peak element
        int peakIndex = findPeakElement(arr);

        // Output the peak element and its index
        System.out.println("Peak element is at index: " + peakIndex + 
                           " with value: " + arr[peakIndex]);
    }
}
