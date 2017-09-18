
public class NumDemo02 {
	
	public static void main(String[] args) {
		//1.基本数据类型
		
		//数据类型  变量名 = 常量;
		
		//开房
		//房间号  301  302  303     变量名
		//房间类型  单人间  双人间  情侣间  数据类型
		
		byte a1 = 1;
		short a2 = 2;
		int a3 = 4;
		long  a4 = 8;
		
		System.out.println(a1+","+a2+","+a3+","+a4);
		System.out.println(a1+a2+a3+a4);
		
		float b1 = 3.14f;
		double b2 =  12345.54321;
		
		System.out.println(b1 +","+ b2);
		
		char c1 ='c';
		char c2 ='中';
		System.out.println(c1+","+c2);
		
		boolean d1 = false;
		boolean d2 = true;
		System.out.println(d1+","+d2);
		
		//2.引用(对象)类型
		String str = "你好";
		System.out.println(str);
		
		System.out.println(8 + 7 + "Hello");//结果是15Hello
		System.out.println("Hello" + 7 + 8);//结果是Hello78
		System.out.println(7 + "Hello" + 8);//结果是7Hello8
		String str1 = 17 + "ABC";//组成一个新的字符串 17ABC
		System.out.println(str1);
		
		
		//问题1:byte char int float double 累加结果
         byte a11 = 'A';//65
         System.out.println(a11);
         char a12 = 'a';//97
         System.out.println(a12);
         int  a13 = 50;
         float a14 = 3.14f;
         double a15 = 123.456;
         
         double result = a11+a12+a13+a14+a15; 
         
         System.out.println(result);
         
		
		//问题2:string name = null;能不能输出?
         String name1 = "王思聪";
         System.out.println(name1);
         String name2 = null;
         System.out.println(name2);
         String name3 = "";
         System.out.println(name3);

		
 		
	}

}
