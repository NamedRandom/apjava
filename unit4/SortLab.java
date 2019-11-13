import java.util.Random;

public class SortLab {
  public static void main(String[] args) {
    int[] array = {1, 8, 42, 14, 35, 26, 7, 19, 48, 22}; // 10 numbers of your  choice
    System.out.print("Original: ");
    printArray(array);

    System.out.print("Scrambled: ");
    scramble(array);
    printArray(array);

    System.out.print("Insertion Sort: ");
    insertionSort(array);
    printArray(array);
    System.out.print("Scrambled: ");
    scramble(array);
    printArray(array);

    System.out.print("Selection Sort: ");
    selectionSort(array);
    printArray(array);

    System.out.print("Scrambled: ");
    scramble(array);
    printArray(array);

    System.out.print("Merge Sort: ");
    mergeSort(array);
    printArray(array);
  }

  static void scramble(int[] arr) {
    Random rng = new Random();
    int temp, index;
    for (int i = 0; i < arr.length; i++) {
      index = rng.nextInt(arr.length);
      temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
  }

  static void printArray(int[] arr) {
    for (int i : arr) System.out.print(i + " ");
    System.out.print("\n");
  }

  // wrapper around mergesort_srt to make it easier for user
  static void mergeSort(int[] nums) {
    mergeSort_srt(nums, 0, nums.length - 1);
  }

  public static void mergeSort_srt(int array[], int lo, int n) {
    int low = lo;
    int high = n;
    if (low >= high) {
      return;
    }
    int middle = (low + high) / 2;
    mergeSort_srt(array, low, middle);
    mergeSort_srt(array, middle + 1, high);
    int end_low = middle;
    int start_high = middle + 1;
    while ((lo <= end_low) && (start_high <= high)) {
      if (array[low] < array[start_high]) {
        low++;
      } else {
        int Temp = array[start_high];
        for (int k = start_high - 1; k >= low; k--) {
          array[k + 1] = array[k];
        }
        array[low] = Temp;
        low++;
        end_low++;
        start_high++;
      }
    }
  }

  static void insertionSort(int[] array) {
    int j, index, key;
    for (j = 1; j < array.length; j++) {
      key = array[j];
      for (index = j - 1; (index >= 0) && (array[index] > key); index--) {
        array[index + 1] = array[index];
      }
      array[index + 1] = key; // insert key into proper position
    }
  }

  static void selectionSort(int[] nums) {
    int index, j, temp, moves, min, minIndex;
    moves = 0;
    for (index = 0; index < nums.length; index++) {
      min = nums[index];
      minIndex = index;
      for (j = index + 1; j < nums.length; j++)
        if (nums[j] < min) {
          min = nums[j];
          minIndex = j;
        }
      // perform the swap
      if (min < nums[index]) {
        temp = nums[index];
        nums[index] = min;
        nums[minIndex] = temp;
        moves++;
      }
    }
  }
}
