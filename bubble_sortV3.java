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
		for (int elements : arr) {
			System.out.println(elements);
		}

	}

	public static void main(String[] args) {

		int[] numberExample1 = { 1, 30, 44, 3, 5, 6, 2, 0 };
		int[] numberExample2 = { 100, 20, 10, 4, 1, 0 };
		bbSort(numberExample1);
		bbSort(numberExample2);
	}
}
