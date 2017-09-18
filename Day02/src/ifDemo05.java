import java.util.Scanner;

/**
 * 选择结构  if
 * @author Administrator
 *
 */

public class ifDemo05 {
	
	public static void main(String[] args) {
		System.out.println("你好");
		System.out.println("你好");
		System.out.println("你好");
	
		
		//第一种 if
		int a = 6;
		if(a>5){
			System.out.println("a>5");
		}
		
		int e = 15;
		if(e>0){
			if(e<9){
				System.out.println("e>0 && e<9");
			}
		}
		
		if(e>0  && e<9){
			System.out.println("e>0 && e<9");
		}
		
		
		//if--else
		
		//需求:分数从控制台输入
		//------Scanner的使用----
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩:");
		int score = sc.nextInt();
		//float  sc.nextFloat();
		//sc.next();//String
//		没有char
		if(score>90){
			System.out.println("去浪吧");
		}else{
			System.out.println("好好敲代码");
		}
		
//		第三种  if--else if--else
		if(score > 90){
			System.out.println("A");
		}else if(score > 80){
			System.out.println("B");
		}else if(score > 70){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
		
		
		
		
	}

}
