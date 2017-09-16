/**
 * 递归
 * @author Administrator
 *
 */

public class RecursionDemo06 {
	
	public static void p(String val){
		System.out.println(val);
	}
	
	public static void doWork(){
		System.out.println("调用p方法");
		p("你好.....");//调用p方法
	}

	//递归   自己调用自己
	
	/*其通项公式为：F（0）=0，F(1)=1，
			Fn=F(n-1) +F(n-2)（n>=3，n∈N*），
			现在求F(5)的值*/
	static int fn(int n){   //在递归中 一定要return 结束
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
		   return fn(n-1)+fn(n-2);
		}
	}
	//Exception in thread "main" java.lang.StackOverflowError
//	程序员网站:
	//1.StackOverflow
	//2.GitHub  3个代码   (SVN+Git)
	
	
	public static void main(String[] args) {
		doWork();
		int result = fn(10);
		System.out.println(result);
	}
}
