public class MergeSort {
  public static void main(String[] args) {
    int[] arr = { 45, 12, 89, 34, 23, 90, 11, 67, 54, 32,98, 76, 65, 43, 21, 10, 5, 88, 72, 39,14, 56, 78, 91, 3, 27, 60, 49, 82, 16,100, 1, 6, 9, 25, 37, 58, 64, 71, 83,95, 41, 29, 18, 7, 52, 69, 86, 93, 30};
    mergeSort(arr, 0, arr.length - 1);
    System.out.println("Sorted Array:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
  // Method to divide the array
  static void mergeSort(int[] arr, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      // Divide left part
      mergeSort(arr, low, mid);
      // Divide right part

      mergeSort(arr, mid + 1, high);
      // Merge both parts
      merge(arr, low, mid, high);
    }
  }
  // Method to merge two sorted halves
  static void merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];
    int left = low; // for left subarray
    int right = mid + 1; // for right subarray
    int index = 0; // for temp array
    // Compare elements from both halves
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[index] = arr[left];
        index++;
        left++;
      } else {
        temp[index] = arr[right];
        index++;
        right++;
      }
    }
    // Copy remaining elements from left subarray
    while (left <= mid) {
      temp[index] = arr[left];
      index++;
      left++;
    }
    // Copy remaining elements from right subarray
    while (right <= high) {
      temp[index] = arr[right];
      index++;
      right++;
    }
    // Copy temp array back to original array
    for (int i = 0; i < temp.length; i++) {
      arr[low + i] = temp[i];
    }
  }
}
