import java.util.Scanner;


public class ScannerDemo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int age =  sc.nextInt();
		System.out.println(age);
		*/
		System.out.println("请输入名字");
		String name = sc.next();
		System.out.println("名字为"+name);
		
		
		//数组遍历
		String[] names = new String[]{"jack","lily","will"};
//		1普通for    元素和下标
		for(int i = 0;i<names.length;i++){
			//通过下标(i)获取元素
			String n1 = names[i];
			System.out.println("第"+(i)+"个名字为"+n1);	
		}
		
		System.out.println("-------------------------");
//		2foreach  元素
		for(String n2:names){
			System.out.println(n2);
		}
		
		
	}

}
