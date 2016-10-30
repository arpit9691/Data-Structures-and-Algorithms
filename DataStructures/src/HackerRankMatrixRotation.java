import java.util.Scanner;

public class HackerRankMatrixRotation {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int column = in.nextInt();
		int rotation = in.nextInt();
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int[][] result = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int left = rotation;
				int x = i, y = j;
				while (left > 0) {
					
				}
			}
		}
	}
}
