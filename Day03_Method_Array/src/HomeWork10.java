
public class HomeWork10 {
	
	static int countAge(int a){//递归
		if(a==1){
			return 15;
		}
		//a=a-1;
		return countAge(--a)+3;
	}
	
	public static void main(String[] args) {
		/*1、	有6个人坐在一起，问第6个人有多少岁，
		他说比第5个人大3岁；问第5个人有多少岁，
		他说比第4个人大3岁；问第4个人有多少岁，
		他说比第3个人大3岁；问第3个人有多少岁，
		他说比第2个人大3岁；问第2个人有多少岁，
		他说比第1个人大3岁；
		问最后个人，他说是15岁，那么，第6个人多少岁？
		*/
		
		//15+3+3.....
		
		int age = countAge(6);
		System.out.println(age);
	}

}
