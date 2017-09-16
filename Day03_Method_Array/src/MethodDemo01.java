/**
 * 方法
 * @author Administrator
 *
 */


/*方法定义格式:   void
    [修饰符]  返回值的类型  方法名称([形式参数,....])
    {
             方法体
             [return 值];
    }
*/



public class MethodDemo01 {
	
	
	
	static double getArea(int r){
		//return r*r*3.14;
		double result = r*r*3.14;
		return result;
		
	}
	
	static int getSum(int a,int b){
		System.out.println("int");
		return 0;
	}
    static int getSum(int b,float a){
    	System.out.println("float");
    	return 0;
	}
    static int getSum2(float a,int b){
    	return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("功能A代码");
		//System.out.println("共同代码  300行");
		//方法调用  static 方法的调用    类名.方法名
		MethodDemo01.doWork();
		
		System.out.println("功能B代码");
		//System.out.println("共同代码  300行");
		MethodDemo01.doWork();
		
		System.out.println("功能C代码");
		//System.out.println("共同代码  300行");
		MethodDemo01.doWork();
		
		System.out.println("功能D代码");
		//System.out.println("共同代码  300行");
		MethodDemo01.doWork();
		
		
		//圆的面积
		int r1 = 10;
		//double area1 = r1*r1*3.14;
		System.out.println(MethodDemo01.getArea(r1));
		
		int r2 = 100;
		//double area2 = r2*r2*3.14;
		System.out.println(MethodDemo01.getArea(r2));
		
		getSum(10,10.1f);
		
	}
	
	//方法定义
	static void doWork() {
		System.out.println("共同代码  800行");
	}

}
