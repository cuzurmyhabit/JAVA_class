import java.util.Scanner;

public class star_of_score {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int[] scoreArr=new int[5];
		int score;
		int maxscore=-1;
		int minscore=101;
		String[] score_arange={"90 점 이상: ", "80 점 이상: ", "70 점 이상: ", "60 점 이상: ", "60 점 미만: "};

		System.out.print("점수 입력: ");
		while(true) {
			score=sc.nextInt();

			if(score<0 || score>100) break;
		
		
			if(score>=90) 	scoreArr[0]++;
			else if(score>=80) 	scoreArr[1]++;
			else if(score>=70) 	scoreArr[2]++;
			else if(score>=60) 	scoreArr[3]++;
			else	 	scoreArr[4]++;

			if(score>maxscore)	maxscore=score;
			if(score<minscore)	minscore=score;
		}

		for (int i=0; i<score_arange.length; i++) {
			System.out.print(score_arange[i]);
			for (int j=0; j<scoreArr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.print("최고 점수: " +maxscore);
		System.out.println();

		System.out.print("최저 점수: " +minscore);

	}
}
