package Sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		int i, j, minIndex, temp;
		
		for (i = 0; i < n - 1 ; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) minIndex = j;
			}
			if (minIndex != i) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		
	}
}
