import java.util.Scanner;

public class star_of_score {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int[] scoreArr=new int[5];
		int score;
		int maxscore=-1;
		int minscore=101;
		String[] score_arange={"90 �� �̻�: ", "80 �� �̻�: ", "70 �� �̻�: ", "60 �� �̻�: ", "60 �� �̸�: "};

		System.out.print("���� �Է�: ");
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

		System.out.print("�ְ� ����: " +maxscore);
		System.out.println();

		System.out.print("���� ����: " +minscore);

	}
}
