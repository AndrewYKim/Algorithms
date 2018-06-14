package ArraySearch;


public class BinarySearch {
	
	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length-1;
		
		while (low <= high) {
			int mid = low + (high-low)/2; // average preventing overflow
			
			if (array[mid] < key) {
				low = mid + 1;
			} else if (array[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
		}
		
		return -1; // 
	}
}