/**
 * 递归练习
 * @author Administrator
 *
 */
public class RecursionTask07 {
	//1、	输入一个数 如5 输出5、4、3、2、1
	static void reduice(int value){
		if(value == 0){
			return;
		}
		System.out.println(value); // 5  4  3  2 1
		value--;
		reduice(value);//自己调自己
	}
	//2、	运用递归，求一个数的阶乘，例如输入5，则就是5的阶乘：5*4*3*2*1
    //5*fac(5-1)---->5*4*fac(4-1)--->5*4*3*fac(3-1)--->5*4*3*2*fac(2-1)
	
	static int fac(int n){
		if(n==0){
			return 1;
		}
	    return n*fac(n-1);
   }
	
	
     public static void main(String[] args) {
		//调用
    	 reduice(5);
    	 
    	 int result = fac(10);
    	 System.out.println(result);
	}
}
