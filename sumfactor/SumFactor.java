package sumfactor;

public class SumFactor {
private int sum;
private int count;
	public int sumFactor(int[] array) {
		sum=0;
		count=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
			
		}
		for (int i = 0; i < array.length; i++) {
			if(sum==array[i])
				count++;
		}
		
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumFactor s = new SumFactor();
		int[] array={3, 0, 2, -5, 0};
		System.out.println(s.sumFactor(array));

	}

}
