
public class arrayExamples {

	public static void main(String[] args) {

		int[] integerArr = new int[5];
		String[] words = {"potato","cheese","cats"};
		double[] doubleArr = {12.2,3.1,9.9,11.14};
		Boat[] boatArr = new Boat[4];
		Boat[] boatArr2 = new Boat[4];
		
		Boat b1 = new Boat();
		boatArr[0] = b1;
		
		System.arraycopy(boatArr, 0, boatArr2, 0, 2);
		//               src     pos  dest    dest loc  length
		System.out.println(boatArr[0].getName());
		
		
		for (int i=0; i<integerArr.length; i++){
			integerArr[i] = i;
		}


	}


}
