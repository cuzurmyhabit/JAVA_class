public class ArrayExam11{
	public static void main(String args []){
		
		int[][] a=new int[2][3];
		a[0][0]=1; a[0][1]=2; a[0][2]=3;
		a[1][0]=10; a[1][1]=20; a[1][2]=30;
	
		//배열의 행 개수 -> 배열의 길이 
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+ "\t");
			}
		}		
	}	
}