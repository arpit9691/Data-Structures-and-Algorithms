import java.util.Scanner;

public class HackerRankStringMatrix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int length = s.length();
		float squareRoot = (float) Math.sqrt(length);
		int row = (int) Math.floor(squareRoot);
		int column = (int) Math.ceil(squareRoot);
		if (row * column < length) {
			row = column;
		}
		Character[][] matrix = new Character[row][column];
		int k = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column && k < length; j++) {
				matrix[i][j] = s.charAt(k);
				k++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < column; j++) {
			for (int i = 0; i < row; i++) {
				if (matrix[i][j] != null) {
					sb.append(matrix[i][j]);
				}
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
