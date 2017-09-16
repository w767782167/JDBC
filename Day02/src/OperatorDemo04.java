
public class OperatorDemo04 {
	public static void main(String[] args) {
		//3.比较运算符
		int a = 1;
		int b = 2;
		System.out.println(a=b); //2  赋值
		// a = 2  b = 2;
		System.out.println(a>b); //false
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
//		4.三元运算符
		//现在给一个小数，需要求出其四舍五入之后的结果，
		//怎么完成该功能？
		
		double c = 3.49;
		
		//double---->int
		int c1 = (int)c;
		System.out.println(c1);
		double num = c-c1;//0.51
		
		int result = (num >= 0.5) ? (c1+1):(c1);
		System.out.println(result);
		
		//练习:
			//1):两个数求最大值/最小值;
		int n = 30;
		int m = 20;
		int max = (n>m)? n : m;
		int min = (n>m)? m : n;
		System.out.println(max);
		System.out.println(min);
		
			//2):判断一个数的是奇数还是偶数. 
         int number = 11;
         String res = (number%2 == 0) ? "偶数" : "奇数";
         System.out.println(res);
         
         
         //5.逻辑运算符
         //boolean  result = 表达式A   逻辑运算符   表达式B;
         //a...&&  与
         //范围(3--5)
         int a1 = 6;
         boolean res1 = (a1 >= 3) && (a1 <= 5);
         System.out.println(res1);
		
         
         int j = 10;
         System.out.println((j>100) && (j++ == 1));//
         //System.out.println((j++ == 1) && (j>100));
         System.out.println("j = "+j);// 10
         
        // System.out.println((j>0) && (j++ == 10));
         System.out.println((j>0) && (++j == 10));
         System.out.println("j = "+j); //11
         
         //b..  ||  或
         //范围不在(3---5)
         int a2 = 4;
		 boolean res2 = (a2<3) || (a2>5);
		 System.out.println(res2);
		 
		 int k = 10;
		 System.out.println((k>100) || (k++ == 1));
		 System.out.println("k = "+k); //11
		 System.out.println((k>0) || (k++ == 1));
		 System.out.println("k = "+k);//11
		 
		 
		 
		 //c ....!
		 System.out.println(!false);
		
		
		
		
		
		
	}
    
}
