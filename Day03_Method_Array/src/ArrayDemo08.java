/**
 * 数组
 * @author Administrator
 *
 */
public class ArrayDemo08 {
	
	public static void main(String[] args) {
		//定义变量
		int a;
		//定义数组
//		
		//System.out.println(ages.length);
		
		//数组初始化
		//1.静态初始化
		/*数组元素类型[]  数组名 = 
				new 数组元素类型[]{元素1,元素2,元素3,.......};
		*/
		int[] nums = new int[]{2,4,6,8};
		System.out.println(nums.length);
		
		System.out.println(nums);//hashcode  内存地址
		
		nums = new int[]{1,3,5,7,9};
		System.out.println(nums.length);
		
		//简单写法
		int[] ages = {1,2,3,4,5,6};
		System.out.println(ages.length);
		
		
		//2.动态初始化
		
		  //数组元素类型[]  数组名 = new  数组元素类型[ length ];
		int[] arrays = new int[10];
		System.out.println(arrays.length);
		
		arrays = new int[8];
		System.out.println(arrays.length);
	}

}
