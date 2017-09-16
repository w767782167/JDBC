
public class OperatorDemo03 {
	public static void main(String[] args) {
		//1.算术运算符
		int a = 20;
		int b = 40;
		int res = a + b;
		System.out.println("a+b="+res);
		res = a-b;
		System.out.println("a-b="+res);
		res = a*b;
		System.out.println("a*b="+res);
		res = a/b;
		System.out.println("a/b="+res);
		
		// ++  --
		int a1 = 5;
		int b1 = a1++;
		System.out.println(a1 + "," + b1); //6,5
		
		
		int a2 = 5;
		int b2 = ++a2;
		System.out.println(a2 + "," + b2);//6,6
		
		//2.赋值运算符
		int i = a+b;  //=  ==  ===
		int h = 50;
		
		h += 200;// h=h+200;   250
		System.out.println(h);
		h -= 100; //h=h-100;  250  150
		System.out.println(h);
		h *= 20;// h=h*20;  150   3000
		System.out.println(h);
		h /= 50;// h=h/50; 3000   60
		System.out.println(h);
		h %= 10;// h=h%10;  60   0
		System.out.println(h);
		
		
		
		
		
		
		
	}
    
}
