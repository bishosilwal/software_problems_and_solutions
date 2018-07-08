package primecount;

public class PrimeCount {
	private int count;

	PrimeCount() {
		count = 0;
	}

	public int primeCount(int start, int end) {
		if (start <= end) {
			int j;
			for (int i = start; i <= end; i++) {

				for (j = 2; j < i; j++) {
					if (i % j == 0)
						break;
				}
				if (j == i)
					count++;
			}

		} else {
			return 0;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeCount p = new PrimeCount();
		System.out.println(p.primeCount(-10, 6));

	}

}
