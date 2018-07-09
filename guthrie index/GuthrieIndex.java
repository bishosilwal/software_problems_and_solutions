package guthrieIndex;

public class GuthrieIndex {
	private int count;

	public int guthrieIndex(int n) {
		count = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				count++;
			} else {
				n = n * 3 + 1;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuthrieIndex g = new GuthrieIndex();
		System.out.println(g.guthrieIndex(4));
	}

}
