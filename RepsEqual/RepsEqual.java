package repsequal;

import java.util.Stack;

public class RepsEqual {

	public int repsEqual(int a[], int n) {
		String s = Integer.toString(n);
		String numArray = "";
		String str;
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			if (num > 0) {
				for (int k = i; k < a.length; k++) {
					str = Integer.toString(a[k]);
					numArray = numArray + str;
				}
				break;

			}

		}
		if (numArray.equals(s))
			return 1;
		else
			return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepsEqual r = new RepsEqual();
		int[] a = { 0,0, 3, 2, 0, 5, 3 };
		System.out.println(r.repsEqual(a, 32053));
	}

}
