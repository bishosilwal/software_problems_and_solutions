package nUnique;

public class NUnique {
	private int count;

	public int isNUnique(int[] a, int n) {
		count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > n)
				continue;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > n)
					continue;
				if ((a[i] + a[j]) == n)
					count++;
				if (count > 1) {
					return 0;
				}
			}

		}
		if (count == 1)
			return 1;
		else
			return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NUnique n = new NUnique();
		int a[] = {7, 3, 3, 2, 4};
		System.out.println(n.isNUnique(a, 8));
	}

}
