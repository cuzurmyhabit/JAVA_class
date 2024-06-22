import java.util.Scanner;

public class Score_1418_Arr2_menu {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("인원 수 입력: ");
		int stu_num=sc.nextInt();

		String[] sub_name={"국어", "영어", "수학", "자바"};

		String[] grade=new String[stu_num];
		String[] name=new String[stu_num];
		int[][] score=new int[stu_num][5];
		double[] average=new double[stu_num];
		char[] getgrade=new char[stu_num];
		int[] rank=new int[stu_num];

		for (int i=0; i<stu_num; i++) {

			System.out.print("학번: ");
			grade[i]=sc.next();

			System.out.print("이름: ");
			name[i]=sc.next();

			for (int j=0; j<4; j++) {
				do {
					System.out.print(sub_name[j]+ " 점수 입력: ");
				 	score[i][j]=sc.nextInt();
				} while (!(score[i][j]>=0 && score[i][j]<=100));
			}

			score[i][4]=Total(score[i][0], score[i][1], score[i][2], score[i][3]);
			average[i]=Average(score[i][4]);
			rank[i] = 1;
		}

		for (int i=0; i<stu_num; i++) {
			rank[i]=1;

			for (int j=0; j<stu_num; j++) {
				if (score[i][4]<score[j][4]) {
				rank[i]++;
				}
			}
		}

		System.out.println("== 출력 메뉴 선택 ==");
		System.out.println("1. 입력순 출력");
		System.out.println("2. 학번순 출력");
		System.out.println("3. 석차순 출력");
		int menu=sc.nextInt();

		if(menu==1){

			// 입력순
			System.out.println("학번  이름  국어 영어 수학 자바 총점  평균  등급  등수");
			System.out.println("입력순");
			for (int i=0; i<stu_num; i++) {
			System.out.printf("%4s%5s%5d%5d%5d%5d%6d%8.2f%4c%5d\n", grade[i], name[i], score[i][0], score[i][1], score[i][2], score[i][3], score[i][4], average[i], getGrade(average[i]), rank[i]);
			}
		}

		else if(menu==2){
			// 학번순
			System.out.println("학번  이름  국어 영어 수학 자바 총점  평균  등급  등수");
			System.out.println("학번순");
			for (int i=0; i<stu_num - 1; i++) {
				for (int j=i+1; j<stu_num; j++) {
					if (grade[i].compareTo(grade[j])>0) {
						// 학번 교환
						String tempstr=grade[i];
						grade[i]=grade[j];
						grade[j]=tempstr;
                    
						// 이름 교환
						tempstr=name[i];
						name[i]=name[j];
						name[j]=tempstr;
                    
						// 점수 교환
						int[] temparr=score[i];
						score[i]=score[j];
						score[j]=temparr;
                    
						// 평균 교환
						double tempdbl=average[i];
						average[i]=average[j];
						average[j]=tempdbl;
                    
						// 등급 교환
						char tempChar=getgrade[i];
						getgrade[i]=getgrade[j];
						getgrade[j]=tempChar;
                    
						// 순위 교환
						int tempInt=rank[i];
						rank[i]=rank[j];
						rank[j]=tempInt;
					}
				}
			}

			for (int i=0; i<stu_num; i++) {
			System.out.printf("%4s%5s%5d%5d%5d%5d%6d%8.2f%4c%5d\n", grade[i], name[i], score[i][0], score[i][1], score[i][2], score[i][3], score[i][4], average[i], getGrade(average[i]), rank[i]);
			}
		}

		else if(menu==3){
			// 석차순
			System.out.println("학번  이름  국어 영어 수학 자바 총점  평균  등급  등수");
			System.out.println("석차순");
			for (int i=0; i<stu_num-1; i++) {
				for (int j=i+1; j<stu_num; j++) {
					if (rank[i]>rank[j]) {
						// 학번 교환
						String tempstr=grade[i];
						grade[i]=grade[j];
						grade[j]=tempstr;
                    
						// 이름 교환
						tempstr=name[i];
						name[i]=name[j];
						name[j]=tempstr;
                    
						// 점수 교환
						int[] temparr=score[i];
						score[i]=score[j];
						score[j]=temparr;
                    
						// 평균 교환
						double tempdbl=average[i];
						average[i]=average[j];
						average[j]=tempdbl;
                    
						// 등급 교환
						char tempChar=getgrade[i];
						getgrade[i]=getgrade[j];
						getgrade[j]=tempChar;
                    
						// 순위 교환
						int tempInt=rank[i];
						rank[i]=rank[j];
						rank[j]=tempInt;
					}
				}
			}

			for (int i=0; i<stu_num; i++) {
			System.out.printf("%4s%5s%5d%5d%5d%5d%6d%8.2f%4c%5d\n", grade[i], name[i], score[i][0], score[i][1], score[i][2], score[i][3], score[i][4], average[i], getGrade(average[i]), rank[i]);
			}
		}
	} // main

	static int Total(int kor, int eng, int math, int java) {
		int sum=kor+eng+math+java;
		return sum;
	} // Total

	static double Average(int total) {
		return (double) total/4;
	} // Average

	static char getGrade(double average) {
		char getgrade;
		switch ((int) average/10) {
			case 10:
			case 9:	getgrade='A'; break;
			case 8:	getgrade='B'; break;
			case 7:	getgrade='C'; break;
			case 6:	getgrade='D'; break;
			default:	getgrade='F';
		} // switch

		return getgrade;
	} // getGrade
} // class
