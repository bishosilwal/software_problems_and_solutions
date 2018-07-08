package inertial;

import java.util.Collection;

public class Inertial {
	private int max, oddIndex, evenIndex;
	private int[] oddArray, evenArray;
	private int evenMax, oddMin, evenCount;

	Inertial() {
		max = 0;
		oddIndex = 0;
		evenIndex = 0;
		evenMax = 0;
		evenCount = 0;
	}

	public int isInertial(int[] array) {
		int i;
		// check for odd element
		for (i = 0; i < array.length; i++) {
			if ((array[i] % 2) != 0)
				break;
		}
		if (i == array.length)
			return 0;
		// find maximum value in array
		for (i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			// count total even element in array
			if (array[i] % 2 == 0)
				evenCount++;
		}
		// if maximum value is not an even value then return 0
		if (max % 2 != 0)
			return 0;
		oddArray = new int[array.length - evenCount];
		evenArray = new int[evenCount];

		// find even and odd element and put them in a separate array
		for (i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				// put all the even value except the maximum even value
				if (array[i] != max) {
					evenArray[evenIndex] = array[i];
					evenIndex++;
				}

			} else {
				oddArray[oddIndex] = array[i];
				oddIndex++;
			}

		}
		// find the maximum value in a even array
		// find the minimum value in a odd array

		oddMin = oddArray[0];
		for (i = 0; i < array.length; i++) {
			if (i < evenCount) {
				if (evenArray[i] > evenMax)
					evenMax = evenArray[i];
			}
			if (i > 0 && i < (array.length - evenCount)) {
				if (oddArray[i] < oddMin)
					oddMin = oddArray[i];
			}
		}
		if (oddMin > evenMax)
			return 1;

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inertial i = new Inertial();
		//int[] a = { 11, 4, 20, 9, 2, 8 };
		//int[] a = { 12, 11, 4, 9, 2, 3, 10};
		int[] a={2, 4, 6, 8, 10};
		System.out.println(i.isInertial(a));
	}

}
