public class HackerRankBeautifulTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 4, 5, 7, 8, 10 };
		int d = 3;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			int j = i, k = i + 1, tempCount = 0;
			while (k < a.length) {
				if (a[k] - a[j] == d) {
					j = k;
					if (tempCount == 1) {
						count++;
						break;
					} else {
						tempCount++;
					}
				}
				k++;
			}
		}
		System.out.println(count);
	}

}
