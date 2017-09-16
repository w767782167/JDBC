/**
 * 方法执行流程
 * @author Administrator
 *
 */
public class MethodDemo04 {
	
	//定义方法
	static int getSum(int a,int b){
		System.out.println(a+","+b);
		//System.out.println(a+b);
		int result = a + b;
		return result;
	}
	
	
	public static void main(String[] args) {
//		调用方法
		
		int sum = MethodDemo04.getSum(4, 6);
		//int sum = 10
		System.out.println(sum);
		
		sum = MethodDemo04.getSum(5, 8);
		System.out.println(sum);
		
		sum = MethodDemo04.getSum(15, 18);
		System.out.println(sum);
	}

}
