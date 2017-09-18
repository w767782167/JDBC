import java.util.Scanner;

public class SwitchTask07 {

	public static void main(String[] args) {
		/*
		 * 课堂练习： 1、使用Switch完成成绩评测以下： 成绩90—100：优秀 成绩80-89：良好 成绩60-79：中等 成绩<60:不及格
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩:");
		int score = sc.nextInt();

		// int
		/*
		 * switch (score / 10) { case 10: case 9: System.out.println("A");
		 * break; case 8: System.out.println("B"); break; case 7: case 6:
		 * System.out.println("C"); break;
		 * 
		 * default: System.out.println("D"); break; }
		 */

		// char
		char c = (score>=90)?'A':((score>=80)?'B':(score<60?'D':'C'));

		switch (c) {
		case 'A':
            System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		case 'C':
			System.out.println("C");
			break;
		case 'D':
			System.out.println("D");
			break;

		default:
			System.out.println("输入有错误");
			break;
		}

	}

}
