import java.util.*;

class Main {
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
		Arrays.sort(arr);

		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");

		}
	}
}

// import java.util.Arrays;

// class Main {
// 	public static void main(String args[])
// 	{
// 		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
// 		System.out.println("The original array is: ");
// 		for (int num : arr) {
// 			System.out.print(num + " ");
// 		}
// 		Arrays.sort(arr);
// 		System.out.println("\nThe sorted array is: ");
// 		for (int num : arr) {
// 			System.out.print(num + " ");
// 		}
// 	}
// }