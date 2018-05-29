import java.util.Scanner;
public class GradeReport2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 ");
		String name = scan.next();
		System.out.print("국어점수 ");
		int num1 = scan.nextInt();
		System.out.print("영어점수 ");
		int num2 = scan.nextInt();
		System.out.print("수학점수 ");
		int num3 = scan.nextInt();
		int num4 = (num1 + num2 + num3) / 3 / 10;
		String grade = "";
		String result = "";

		switch(grade){
				case 9 : num4 = "A" ;break;
				case 8 : num4 = "B" ;break;
				case 7 : num4 = "C" ;break;
				case 6 : num4 = "D" ;break;
				case 5 : num4 = "E" ;break;
				default : result = "F";break;


		}


		System.out.print(name + " [평균]" + num4 + " [학점]" + grade);

	}
}

// 평균 90점 이상 'A'
// 80 'B'
// 70 'C'
// 60 'D'
// 50 'E'
// 50 미만 'F'

// 평균'int'