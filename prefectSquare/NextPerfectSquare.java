package nextperfectsquare;

public class NextPerfectSquare {

	
	
	public int getPerfectSquare(int num){
		int temp;
		while(true){
			num++;
			temp=(int)Math.sqrt(num);
			if(temp*temp==num){
				return num;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NextPerfectSquare square=new NextPerfectSquare();
		System.out.println(square.getPerfectSquare(-11));
	}

}
