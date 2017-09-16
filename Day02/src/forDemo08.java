import java.awt.font.NumericShaper;

/**
 * 循环结构  
 * 
 * @author Administrator
 *
 */

public class forDemo08 {
	public static void main(String[] args) {
		//1------while
		
		//案例：叫500声帅锅,打印500次.
		int count = 0;
		while(count<5){
			System.out.println("帅哥"+count);
			count++;
		}
		//案例：从1数到100,打印从1~100
		int num = 1;
		while(num<=100){
			System.out.println("num = "+num);
			num++;
		}
		
		//案例：帮大圣解决问题，计算100以内的正整数和。
		int number = 1;
		int sum = 0;
		while(number<=100){
			sum += number;
			number++;
		}
		System.out.println("sum="+sum);
		
		//2----do..while
		count = 0;
		do{
			System.out.println("帅哥");
			count++;
		}while(count<5);
		
		//3....for
		for(int i = 0;i<50;i++){
			System.out.println("美女");
		}
		
		int j = 3;
		for(;;j++){
			System.out.println("美女");
		}

	}
	

}
