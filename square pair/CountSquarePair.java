package squarepair;

public class CountSquarePair {
	private int count;

	CountSquarePair() {
		count = 0;
	}

	public int countSquarePair(int[] array){
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(isSquarePair(array[i],array[j]))
					count++;
				
			}
			
		}
		return count;
		
	}

	public boolean isSquarePair(int a, int b) {
		if (a <= 0 || b <= 0 || a >= b)
			return false;

		if (isPerfectSquare(a + b))
			return true;
		else
			return false;
	}

	public boolean isPerfectSquare(int a) {
		int temp = (int) Math.sqrt(a);
		if (temp * temp == a) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountSquarePair s = new CountSquarePair();
		//int[] a={9, 0, 2, -5, 7};
		int[] a={11, 5, 4, 20} ;
		System.out.println(s.countSquarePair(a));
	}

}
