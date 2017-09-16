/**
 * 数组操作
 * @author Administrator
 *
 */


public class ArrayDemo09 {
	
	//3:获取数组最大最小元素(getMax,getMin).
	
	//{30,50,20,40,10}
	static int getMax(int[] a){
		int max = a[0];
		for(int i = 1;i<a.length;i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		return max;
	}
	
//	4:打印数组元素//[A,B,C,D]   json xml
	static void printArr(String[] arr){
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
	
	 /*5:逆序排列数组元素:
	        原数组:[A, B, C, D, E]
	        逆序操作
	        新数组:[E, D, C, B, A]
*/
	
	static String[] reverse(String[] oldArr){
		String[] newArr = new String[oldArr.length];
		for(int i = oldArr.length-1;i>=0;i--){
			System.out.println("newArr["+(oldArr.length-1-i)+"],oldArr["+i+"]");
			// i = 4;
			// oldArr.length-1 = 4
			newArr[oldArr.length-1-i] = oldArr[i];
			 /*
			 //4-4 =0       4
			   4-3 = 1      3
			  4-2 = 2	   2
			  4-1 =3             1
			  */
			              
		} 
		
		return newArr;
	}
	
	
	
//	6:线性搜索  查找
	
	//元素出现索引(下标)  第一次  最后一次
	static int indexof(int[] arr,int key){
		for(int i = 0;i<arr.length;i++){
			if(key == arr[i]){
				return i;
			}
		}
		return -1;
	}
	
	static int lastIndexof(int[] arr,int key){
		for(int i = arr.length-1;i>=0;i--){
			if(key == arr[i]){
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		//--------1:数组基本操作
		int[] nums = {2,4,6,8};
		//nums = {1,3,5,7,9};  错误的
		nums = new int[]{1,3,5,7,9};
		
		//a.获取元素的值
		int tempNum = nums[0];
		System.out.println(tempNum);
		
		//b.给数组元素设置值
		nums[2] = 10;
		System.out.println(nums[2]);
		
		System.out.println("------------------------");
		//c.遍历数组  把数组元素,一个一个取出来
		//1.普通for  下标(索引  0 ,1,2,3,4)  和 元素
		for(int i = 0;i<nums.length;i++){
			System.out.println(i+","+nums[i]);
			
//			if(i == 2){
//				break;
//			}
		}
		
		System.out.println("------------");
		//2.快速foreach  java5  只能拿出元素
		for (int val : nums) {
			System.out.println(val);
		}
		
		String[] names = {"rose","jack","tom"};
		for (String str : names) {
			System.out.println(str);
		}
		
		
		//--------2:操作数组常见异常
//		a.数组越界
		
		// java.lang.ArrayIndexOutOfBoundsException
		//数组越界的错误提示
		//String tempName = names[5];
		//System.out.println(tempName);
		
//		b.空引用
		//java.lang.NullPointerException 空引用
		//names = null;
		//System.out.println(names.length);
		
		 //--------3:获取数组最大最小元素(getMax,getMin).
		int[] a = {30,50,200,40,10};
		int max = getMax(a);
		System.out.println(max);
		
		
		//-------- 4:打印数组元素
		String[] arr = {"A","B","C","D"};
		//System.out.println(arr);//[A,B,C,D]
		//arr=null;
		printArr(arr);
		
		
		/* 5:逆序排列数组元素:
		        原数组:[A, B, C, D, E]
		        逆序操作
		        新数组:[E, D, C, B, A]
		        */
        String[] sortArry =   reverse(arr);
        printArr(sortArry);
		
		
		
		//---------6:线性搜索.
		/*int[] arr1 = {10,20,30,10,50,-30,10};
		int result1 = indexof(arr1,10);
		System.out.println(result1);
		int result2 = lastIndexof(arr1, 10);
		System.out.println(result2);
		*/
		
	}

}
