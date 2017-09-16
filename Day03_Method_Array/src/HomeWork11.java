import java.util.Scanner;


public class HomeWork11 {
	
	/*2、	控制台输入10学生的成绩，计算最高，
	最低分，总分，平均分的值并输出*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		for(int i=0;i<scores.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生的成绩");
		    int s = sc.nextInt();
		    //设置元素
		    scores[i] = s;
		}
		
		/*for (int score : scores) {
			System.out.println("score =" +score);
		}*/
		
		//最大和最小
		int min = scores[0];
		int max = scores[0];
		for(int i = 1;i<scores.length;i++){
			if(min>scores[i]){
				min = scores[i];
			}
			
			if(max<scores[i]){
				max = scores[i];
			}
		}
		System.out.println("最大值是"+max+",最小值是"+min);
		
		
		int sum = 0;
		int avg = 0;
		for (int score : scores) {
			sum = sum+score;
			//sum += score;
		}
		
		avg = sum/scores.length;
		System.out.println("sum = "+sum+",avg="+avg);
		
		
	}

}
