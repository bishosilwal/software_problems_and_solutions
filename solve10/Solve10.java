package solve10;
public class Solve10 {
	private int[] coord;
	private boolean solved = false;

	Solve10() {
		coord = new int[2];
	}

	public int[] solve10() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if ((fact(i) + fact(j)) == 3628800) {
					coord[0] = i;
					coord[1] = j;
					return coord;
				}
				System.out.println("i= " + i + " and j= " + j);
			}
		}
		return coord;

	}

	private int fact(int a) {
		int num = 1;
		for (int i = a; i > 0; i--) {
			num *= i;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solve10 s = new Solve10();
		int[] coord = s.solve10();
		System.out.println(coord[0] + " , " + coord[1]);

		// System.out.println(3628800/2);
	}

}
