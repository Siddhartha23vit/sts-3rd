import java.util.*;

public class Leader {

	public static void printlead(int arr[], int size){
		int maxfromright = arr[size-1];
		ArrayList<Integer> leaderlist = new ArrayList<>();
		leaderlist.add(maxfromright);

		for(int i = size - 2; i >=0; i--){
			if(maxfromright<arr[i]){
				maxfromright = arr[i];
				leaderlist.add(maxfromright);
			}
		}

		for(int i = leaderlist.size()-1; i >=0; i--){
			System.out.print(leaderlist.get(i)+ " ");

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		printlead(arr, n);

	}
}