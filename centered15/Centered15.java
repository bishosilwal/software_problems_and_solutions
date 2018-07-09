package centered15;

public class Centered15 {

	private int sum;

	public int isCentered15(int[] a) {
		for (int i = 0; i <=(a.length / 2); i++) {
			sum = 0;
			for (int j = i; j < (a.length - i); j++) {
				sum += a[j];
			}
			if (sum == 15)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Centered15  c=new Centered15();
		int a[]={1, 1, 15 -1,-1};
		System.out.println(c.isCentered15(a));
	}

}
