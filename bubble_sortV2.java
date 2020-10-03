package bubbleSort;

public class bubble_sort {

	public static void bbSort(int[] arr) {
		int temp;
		for (int i = 0; i < (arr.length - 1); i++) {
			for (int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}

	}

	public static void main(String[] args) {

		int[] numberExample = { 1, 30, 44, 3, 5, 6, 2, 0 };
		bbSort(numberExample);
	}
}
