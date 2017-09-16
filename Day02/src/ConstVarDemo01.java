
public class ConstVarDemo01 {
	//成员变量(全局变量)
	static int var = 200;
	static int a = 100;
	
	public static void haha(){
		int d = 30;
	}
	
	public static void main(String[] args) {
		/*//需求:两个数的计算
		int a = 6;
		int b = 3;
		System.out.println(a-b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//需求:第一个数改为8
		a = 8;
		System.out.println(a-b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//需求:第一个数改为15
		a = 15;
		System.out.println(a-b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		*/
		
		System.out.println(a);
		
	  //--------	局部变量
		//定义变量
		//第1种方法
		int a;
		a = 10;
		
		//第二种方法
		int b = 10;  //就近原则
		
		System.out.println(a+","+b);//字符串
		
		System.out.println(var);
		
//		int c; //变量必须有值 才能使用
//		System.out.println(c);
		
		
		//int b = 12;
		
		System.out.println(a+b);
		System.out.println("a+b");
		
		
		
	}

}
