/**
 * 
 * @author Administrator
 *
 */

public class ParmerDemo01 {
	
	//a．方法参数的值传递机制之基本数据类型
	static void change(int a){
		System.out.println("chang before"+a);//10
		//a = 10
		a = 50;//只是赋值一份  值传递
		
		System.out.println("chang after"+a);//50
	}
    // b．方法参数的值传递机制之引用数据类型
	static void swap(int[] arr){
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	
	//打印数组
	static void printArr(int[] arr){
		if(arr==null){
			System.out.println("null");
			return;
		}
		String str="[";
		for(int index = 0;index<arr.length;index++){
			str = str+arr[index];
			if(index != arr.length-1){
				str = str+",";
			}
		}
		str = str+"]";
		System.out.println(str);
	}
	public static void main(String[] args) {
		
		// 值传递  不改变值  基本数据类型8
		int  a = 10;
		System.out.println("main before"+a);//10
		change(a);
		System.out.println("main after"+a);//10  
		
		//地址传递  可以改变值  引用类型
		int[] arr = new int[]{10,99};
		printArr(arr);
		swap(arr);
		printArr(arr);
		
		
	}


}
