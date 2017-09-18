
public class HomeWork03 {
	//-------方法定义
	
	//1、定义4个方法,它们都是接收2个整形数，分别对这2个整形数作+-*%运算，并把结果返回
     static int add(int a,int b){
    	 int result = a+b;
    	 return result;
     }
     
     static int mul(int a,int b){
    	 int result = a*b;
    	 return result;
     }
     
	
	//2、定义一个方法，此方法可以判断比较两个数的最大值
     static int theMax(int a,int b){
    	 /*if(a>b){
    		 return a;
    	 }else {
    		 return b;
    	 }*/
    	 
    	 /*
    	 if(a>b){
    		 return a;
    	 }
    	 return b;
    	 */
    	 
    	 return a>b?a:b;
    	 
     }

	//3、定义一个打印99乘法表功能的方法
     static void while99(){
    	 for(int line = 1;line<=9;line++){
 			for(int i = 1;i<=line;i++){
 				System.out.print(i+"*"+line+"="+(i*line)+"\t");
 			}
 			System.out.println();
 		}
     }
	
	
	public static void main(String[] args) {
		//方法调用-----
		int res1 = HomeWork03.add(10, 20);
		System.out.println(res1);
		
		int res2 = HomeWork03.mul(10, 50);
		System.out.println(res2);
		
		
		System.out.println(HomeWork03.theMax(10, 10));
		
		while99();
		
	}

}
