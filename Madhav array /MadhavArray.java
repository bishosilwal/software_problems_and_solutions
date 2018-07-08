package madhavArray;

public class MadhavArray {

	private int prevSum, newSum, index;

	MadhavArray() {
		prevSum = 0;
		newSum = 0;
		index = 0;
	}

	public boolean isMadhavArray(int[] a) {

		int i = 0;
		int l=0;
		while (true) {
			 l = i * (i + 1) / 2;
			if (a.length == l) {
				break;
			}
			if (i > a.length)
				return false;
			i++;
		}
		prevSum = a[0];
		for (int j = 1; j <=i; j++) {
			try {
				newSum = arraySum(a, index, j);
			} catch (ArrayIndexOutOfBoundsException e) {
				return false;
			}
			if(prevSum!=newSum)
				return false;
		}
		return true;
	}

	public int arraySum(int[] array, int index, int count) throws ArrayIndexOutOfBoundsException {
		int sum = 0;
		for (int i = 0; i < count; i++, index++) {
			sum += array[index];
			this.index++;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MadhavArray m = new MadhavArray();
		int a[] = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
		System.out.println(m.isMadhavArray(a));
	}

}
