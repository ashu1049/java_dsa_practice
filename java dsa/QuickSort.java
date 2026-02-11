public class QuickSort {
  public static void main(String[] args) {
    int[] arr = { 10, 7, 8, 9, 1, 5 };

    quickSortRecursion(arr, 0, arr.length - 1);

    System.out.println("Sorted Array:");
    for (int n : arr) {
      System.out.print(n + " ");

    }
  }
  static void quickSortRecursion(int[] arr, int low, int high) {

    int pi = partition(arr, low, high);

    if (low < pi - 1) {
      quickSortRecursion(arr, low, pi - 1);

    }

    if (pi < high) {

      quickSortRecursion(arr, pi, high);

    }
  }
  static int partition(int[] arr, int low, int high) {

    int pivot = arr[(low + high) / 2]; // middle pivot
   

    while (low <= high) {


      while (arr[low] < pivot) {

        low++;
      }


      while (arr[high] > pivot) {

        high--;
      }


      if (low <= high) {

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        low++;
        high--;

      }
    }
   
    return low; // partition index
  }
}































