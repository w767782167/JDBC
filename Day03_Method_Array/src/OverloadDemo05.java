
/**
 * 方法重载设计
 * @author Administrator
 *
 */

public class OverloadDemo05 {
	
	
	//需求1:在同一个类中,分别定义求两个整数,小数之和的方法.
	/*static int getSumInt(int a,int b){
		return a+b;
	}
	static float getSumFloat(float x,float y){
		return x+y;
	}
	static double getSumDouble(double x,double y){
		return x+y;
	}*/
	static int  getSum(int a,int b){
		System.out.println("int");
		return a+b;
	}
	static float getSum(float a,float b){
		System.out.println("float");
		return a+b;
	}
	
	
	

	//需求2:在同一个类中,分别打印String,int,double,boolean类型的方法

	/*static void pString(String val){
		System.out.println(val);
	}
	
	static void pInt(int val){
		System.out.println(val);
	}
	
	static void pDouble(double val){
		System.out.println(val);
	}*/
	
	static void p(String val){
		System.out.println(val);
	}
	
	static void p(int val){
		System.out.println(val);
	}
	
	static void p(float val){
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		
//		调用
//		System.out.println(getSumInt(30, 40));
//		System.out.println(getSumFloat(30.123f, 40.123f));
		
		
		int sum1 = getSum(10,10);
		float sum2 = getSum(10.1f,10);
		
		p("你们");
		p(10);
		p(10.345f);
		
		//按住 Ctrl
		System.out.println("123");
		System.out.print(123);
		
		
	}

}
