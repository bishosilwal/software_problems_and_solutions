package porcupinenumber;

public class PorcupineNumber {

	public int findPorcupineNumber(int n) {
		int num = n + 1;
		int lastDigit;
		int primeNum,newPrime = 0;
		while (true) {
			// find the prime number which is greater than the given number

			primeNum = findPrimeNumber(num);
			newPrime=primeNum;
			// prime number found .Now lets check the last digit of the prime
			// Number which we have found
			lastDigit = primeNum % 10;
			if (lastDigit == 9) {
				// find leading prime number
				newPrime = findPrimeNumber(primeNum);
				lastDigit = newPrime % 10;
				// check the last digit
				if (lastDigit == 9) {
					// finally porcupine number is found
					return primeNum;

				}
			}
			num = newPrime;

		}
	}

	private int findPrimeNumber(int num) {
		int i = num + 1;
		int j;
		while (true) {

			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;

			}
				if (j == i) {
					return i;
				}
			
			i++;
		}
	}

	public static void main(String[] args) {
		PorcupineNumber p = new PorcupineNumber();
		System.out.println(p.findPorcupineNumber(0));
	}
}
