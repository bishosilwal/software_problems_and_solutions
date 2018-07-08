package upcount;

public class Upcount {
	private int upcount;
	private int prevPartSum, newPartSum;

	Upcount() {
		upcount = 0;
		newPartSum = 0;
	}

	private int getUpCount(int[] array, int num) {

		for (int i = 0; i < array.length; i++) {
			newPartSum += array[i];
			if (i != 0) {
				if (prevPartSum <= num && newPartSum > num) {
					upcount++;

				}
			}
			prevPartSum = newPartSum;
		}

		return upcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcount u = new Upcount();
		//int[] a = { 2,3,1,-6,8,-3,-1,2 };
		int[] a={1,2,-1,5,3,2,-3};
		int num = 20;
		System.out.println(u.getUpCount(a, num));
	}

}

