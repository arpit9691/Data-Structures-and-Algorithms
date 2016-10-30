import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankMatrixPatternSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}
			int j = 0;
			boolean found = false;
			Pattern p;
			Matcher m;
			for (int G_i = 0; G_i < R; G_i++) {
				p = Pattern.compile(P[j]);
				m = p.matcher(G[G_i]);
				HashSet<Integer> positions = new HashSet<Integer>();
				while (m.find()) {
					positions.add(m.start());
				}
				if (positions.size() > 0) {
					found = true;
					int l = G_i;
					for (int k = 1; k < r; k++) {
						Pattern p1 = Pattern.compile(P[k]);
						Matcher m1 = p1.matcher(G[l + 1]);
						HashSet<Integer> newPositions = new HashSet<Integer>();
						while (m1.find()) {
							newPositions.add(m1.start());
						}
						if (newPositions.size() > 0) {
							positions.retainAll(newPositions);
							if (positions.size() > 0) {
								found = true;
								l += 1;
							} else {
								found = false;
								break;
							}
						} else {
							found = false;
							break;
						}
					}
				}
				if (found) {
					break;
				}
			}
			System.out.println(found ? "YES" : "NO");
		}
	}
}
