public class ArrayExam14{
	public static void main(String args []){

		int[][] a = new int[4][4];

		int cnt=1;

		for(int i=0; i<a.length; i++){
			for(int j=0; j<=i; j++){
				a[i][j]=cnt++;
			}
		}

		for(int i=0; i<a.length; i++){
			for(int j=0; j<=i; j++){
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}

	}
}