
public class MethodDemo02 {
	//方法定义
	//a:无参数无返回，需求:定义一个方法 专门打印-----------
	static void p(){
		System.out.println("--------------------");
	}
	
	//b:有参数无返回，需求:打印传进入的参数
	static void printVal(String val){
		//int a = 10;
		System.out.println(val);
	}
	
	//c:无参数有返回，//需求:返回张三的年龄
	static int getAge(){
		return 20;
	}
	//需求:返回张三的名字
	static String getName(){
		return "张三";
	}
	
	
	//d:有参数有返回  需求:求两个数的和
	static int getSum(int a,int b){
		//return a+b;
		
		int result = a + b;
		return result;
	}
	
	
	public static void main(String[] args) {
		
		//方法调用
		MethodDemo02.p();
		MethodDemo02.p();
		
		MethodDemo02.printVal("你好,师妹");
		MethodDemo02.printVal("你好,师姐");
		
		
		MethodDemo02.getAge();
	    int age = MethodDemo02.getAge();
	    System.out.println("age="+age);
	    
	    
		int sum = getSum(10,30);
		System.out.println(sum);
		
		
	}

}
