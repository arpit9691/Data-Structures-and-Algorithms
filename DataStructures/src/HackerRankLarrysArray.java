import java.util.Scanner;

public class HackerRankLarrysArray {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int i = 0; i < cases; i++) {
			int size = in.nextInt();
			int[] input = new int[size];
			for (int j = 0; j < size; j++) {
				input[j] = in.nextInt();
			}
			int count = 0;
			for (int j = 0; j < size - 1; j++) {
				for (int k = j + 1; k < size; k++) {
					if (input[j] > input[k]) {
						count++;
					}
				}
			}
			if (count % 2 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
